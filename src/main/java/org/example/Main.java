package org.example;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(3, 5));
        System.out.println(isEvenNumber(4));
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int multiplicate(int a, int b) {
        int sum = a * b;
        return sum;
    }

    public static String makeUppercase(String word) {
        String uppercaseWord = word.toUpperCase();
        return uppercaseWord;
    }

    public static boolean isEvenNumber(int number) {
        boolean isEven = true;
        if (number % 2 == 1) {
            isEven = false;
        }

        return isEven;
    }

    public static boolean checkIfPositive(int number) {
        boolean isPositive = false;
        if (number > 0) {
            isPositive = true;
        }

        return isPositive;
    }
}
