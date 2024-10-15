package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        MyStream networkStream = new NetworkStream();
        Encryptor encryptor = new NaiveEncryptor();
        MyStream fileStream = new EncryptedFileStream(encryptor);

        var processor = new StreamProcessor();
        processor.process(networkStream, "http://example.com");
        processor.process(fileStream, "file.txt");
    }
}
