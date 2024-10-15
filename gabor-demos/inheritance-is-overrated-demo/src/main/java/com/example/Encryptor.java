package com.example;

// also could be a talking name: EncryptionService 
public interface Encryptor {
    byte[] encrypt(byte[] data);

    byte[] decrypt(byte[] data);
}
