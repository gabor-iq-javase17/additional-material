package com.example;

public class NaiveCompressor implements Compressor {

    @Override
    public byte[] compress(byte[] data) {
        // real compression is 81 of lines of code, calling java libraries
        System.out.println("Naive compression");
        return data;
    }

    @Override
    public byte[] decompress(byte[] data) {
        // real decompression is 92 of lines of code, calling java libraries
        System.out.println("Naive decompression");
        return data;
    }

}
