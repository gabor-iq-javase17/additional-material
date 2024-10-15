package com.example;

public class EncyptedStream implements MyStream {

    private final MyStream stream;
    private final Encryptor encryptor;

    public EncyptedStream(MyStream stream, Encryptor encryptor) {
        this.stream = stream;
        this.encryptor = encryptor;
    }

    // simple one-liner to delegate the calls to contained stream
    public void open(String uri) {
        stream.open(uri);
    }

    // simple one-liner to delegate the calls to contained stream
    public void close() {
        stream.close();
    }

    public byte[] read() {
        byte[] data = stream.read();
        return encryptor.decrypt(data);
    }

    public void write(byte[] data) {
        byte[] encryptedData = encryptor.encrypt(data);
        stream.write(encryptedData);
    }
}
