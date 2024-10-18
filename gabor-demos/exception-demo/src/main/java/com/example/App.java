package com.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var textProcessor = new TextProcessor();
        int wordCount;
        try {
            wordCount = textProcessor.wordCountInFileWhichThrows("t:\\sample.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Word count: " + wordCount);
    }
}
