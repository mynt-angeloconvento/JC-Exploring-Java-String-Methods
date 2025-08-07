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

        // // Prediction: "is"
        // String statement = "Java is powerful.";
        // String part = statement.substring(5, 7);
        // System.out.println("The extracted substring is: " + part);

        // // Prediction: "Uppercase: THIS IS A TEST"
        // // Prediction: "Lowercase: this is a test"
        // String mixedCase = "This Is A Test";
        // String upper = mixedCase.toUpperCase();
        // String lower = mixedCase.toLowerCase();
        // System.out.println("Uppercase: " + upper);
        // System.out.println("Lowercase: " + lower);

        // Prediction: 16, 37, -1
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);
    }
}