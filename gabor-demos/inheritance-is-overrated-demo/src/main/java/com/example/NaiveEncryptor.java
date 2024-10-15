package com.example;

public class NaiveEncryptor implements Encryptor {

    @Override
    public byte[] encrypt(byte[] data) {
        // real encryption is 57 of lines of code, calling java libraries
        System.out.println("Naive encryption");
        return data;
    }

    @Override
    public byte[] decrypt(byte[] data) {
        // real decryption is 63 of lines of code, calling java libraries
        System.out.println("Naive decryption");
        return data;
    }

}
