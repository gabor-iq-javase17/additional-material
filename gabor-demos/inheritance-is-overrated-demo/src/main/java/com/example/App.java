package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        MyStream networkStream = new NetworkStream();
        MyStream fileStream = new FileStream();

        var processor = new StreamProcessor();
        processor.process(networkStream, "http://example.com");
        processor.process(fileStream, "file.txt");
    }
}
