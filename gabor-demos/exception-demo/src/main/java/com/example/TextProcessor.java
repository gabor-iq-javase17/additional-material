package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextProcessor {

    public int wordCountInFile(String fileName) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as delimiter
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return wordCount;
    }

    public int wordCountInFileWithExplicitFinally(String fileName) {

        int wordCount = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {

                // Split the line into words using whitespace as delimiter
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;

            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        // guard: unmananged resources should be closed in the finally block
        // GC uses nondeterministic finalization to close resources
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file: " +
                            e.getMessage());
                }
            }
        }
        return wordCount;
    }

    public int wordCountInFileWhichThrows(String fileName) throws Exception {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as delimiter
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        }
        return wordCount;
    }
}
