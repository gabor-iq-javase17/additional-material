package com.example;

public class CompressedStream implements MyStream {

    private final MyStream stream;
    private final Compressor compressor;

    public CompressedStream(MyStream stream, Compressor compressor) {
        this.stream = stream;
        this.compressor = compressor;
    }

    @Override
    public void open(String uri) {
        stream.open(uri);
    }

    @Override
    public void close() {
        stream.close();
    }

    @Override
    public byte[] read() {
        byte[] data = stream.read();
        return compressor.decompress(data);
    }

    @Override
    public void write(byte[] data) {
        byte[] compressed = compressor.compress(data);
        stream.write(compressed);
    }

}
