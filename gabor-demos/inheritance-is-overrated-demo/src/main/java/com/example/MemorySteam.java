package com.example;

public class MemorySteam implements MyStream {
    private String uri;

    public void open(String uri) {
        this.uri = uri;
        System.out.println("Opening memory stream: " + uri);
    }

    public void close() {
        System.out.println("Closing memory stream: " + uri);
    }

    public byte[] read() {
        System.out.println("Reading memory stream: " + uri);
        return new byte[0];
    }

    public void write(byte[] data) {
        System.out.println("Writing memory stream: " + uri);
    }

}
