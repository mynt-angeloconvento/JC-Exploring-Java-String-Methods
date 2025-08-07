package org.example;

public class StringLab {
    public static void main(String[] args) {

        // // Prediction: 14
        // String greeting = "Hello, Cadets!";
        // int length = greeting.length();
        // System.out.println("The length of the string is: " + length);

        // // Prediction: 'l'
        // String message = "Keep learning!";
        // char character = message.charAt(5);
        // System.out.println("The character at index 5 is: " + character);

        // Prediction: "is"
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part);
    }
}