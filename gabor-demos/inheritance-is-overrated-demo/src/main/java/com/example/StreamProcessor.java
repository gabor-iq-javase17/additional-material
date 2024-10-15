package com.example;

public class StreamProcessor {

    // represents 100 000s of lines of client code
    public void process(MyStream stream, String uri) {
        stream.open(uri);
        byte[] data = stream.read();
        stream.write(data);
        stream.close();
    }

}
