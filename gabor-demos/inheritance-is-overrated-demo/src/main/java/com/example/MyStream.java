package com.example;

public interface MyStream {
    void open(String uri);

    void close();

    byte[] read();

    void write(byte[] data);
}
