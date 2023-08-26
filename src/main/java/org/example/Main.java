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
        int sum;
        sum = a + b;
        return sum;
    }

    public static int multiplicative(int a, int b) {
        int sum;
        sum = a * b;
        return sum;
    }

    public static String makeUppercase(String word) {
        return word.toUpperCase();
    }

    public static boolean isEvenNumber(int number) {
        boolean isEven;
        isEven = number % 2 != 1;

        return isEven;
    }

    public static boolean checkIfPositive(int number) {
        boolean isPositive;
        isPositive = number > 0;

        return isPositive;
    }
}
