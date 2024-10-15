package com.example;

public interface Compressor {
    byte[] compress(byte[] data);

    byte[] decompress(byte[] data);
}
