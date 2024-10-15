package com.example;

// this is 1000s lines of code in a real application
public class FileStream implements MyStream {
    private String uri;

    public void open(String uri) {
        this.uri = uri;
        System.out.println("Opening file: " + uri);
    }

    public void close() {
        System.out.println("Closing file: " + uri);
    }

    public byte[] read() {
        System.out.println("Reading file: " + uri);
        return new byte[0];
    }

    public void write(byte[] data) {
        System.out.println("Writing file: " + uri);
    }
}
