package com.example;

public class NetworkStream implements MyStream {
    private String uri;

    public void open(String uri) {
        this.uri = uri;
        System.out.println("Opening network stream: " + uri);
    }

    public void close() {
        System.out.println("Closing network stream: " + uri);
    }

    public byte[] read() {
        System.out.println("Reading network stream: " + uri);
        return new byte[0];
    }

    public void write(byte[] data) {
        System.out.println("Writing network stream: " + uri);
    }
}
