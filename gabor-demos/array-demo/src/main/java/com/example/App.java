package com.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // int[] numbers = new int[5];
        // int[] numbers = new int[] { 1, 2, 3, 4, 5 };
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] copyOfnumbers = new int[5];

        // Array in an object instance in its own right:
        // var x = numbers.length;

        copyOfnumbers = numbers;
        numbers[2] = 10;
        System.out.println(copyOfnumbers[2]);

        int[] cloneOfnumbers = numbers.clone();
        numbers[2] = 11;
        System.out.println(cloneOfnumbers[2]);

        var devices = new Device[] {
                new Device("Device 1", "Type 1", "Active"),
                new Device("Device 2", "Type 2", "Inactive"),
                new Device("Device 3", "Type 3", "Active")
        };

        // shallow copy vs deep copy (array's clone is shallow copy)
        var cloneOfDevices = devices.clone();
        devices[0].setStatus("Inactive");

        System.out.println(cloneOfDevices[0].getStatus());

        ChessPiece[][] chessBoard = new ChessPiece[8][8];
        System.out.println(chessBoard[0][0]);

        int a = 10;
        int b = 20;
        // CQS: Command Query Separation (Segregation)

        // String message;
        // if (a < b) {
        // message = "a is less than b";
        // } else {
        // message = "a is greater than or equal to b";
        // }

        var message = a < b ? "a is less than b" : "a is greater than or equal to b";

        if (a < b && x.operX()) {
            System.out.println("a is less than b and greater than 5");
        }
    }
}
