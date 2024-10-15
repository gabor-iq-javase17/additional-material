package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        MyStream networkStream = new NetworkStream();
        Encryptor encryptor = new NaiveEncryptor();
        Compressor compressor = new NaiveCompressor();
        // Bad, using inheritance:
        // MyStream encryptedFileStream = new EncryptedFileStream(encryptor);
        // Good, using composition:
        MyStream encryptedFileStream = new EncyptedStream(new FileStream(), encryptor);
        MyStream compressedEncryptedNetworkStream = new CompressedStream(
                new EncyptedStream(new NetworkStream(), encryptor), compressor);

        var processor = new StreamProcessor();
        // processor.process(networkStream, "http://example.com");
        // processor.process(encryptedFileStream, "file.txt");
        processor.process(compressedEncryptedNetworkStream, "http://example.com");
    }
}
