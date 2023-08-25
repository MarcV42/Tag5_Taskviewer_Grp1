package org.example;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    MainTest() {
    }

    @Test
    void calculateSum_when3And5_return8() {
        int a = 3;
        int b = 5;
        int actual = Main.calculateSum(a, b);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isEvenNumber_returnTrue_whenNumberIsEven() {
        int number = 2;
        boolean actual = Main.isEvenNumber(number);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiplicate_return10_whenNumber2nd5() {
        int a = 2;
        int b = 5;
        int actual = Main.multiplicate(a, b);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void makeUppercase_returnUppercase_whenCharsAreLower() {
        String word = "fail";
        String actual = Main.makeUppercase(word);
        String expected = "FAIL";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfPositive_returnTrue_whenNumberIs10() {
        int number = 10;
        boolean actual = Main.checkIfPositive(number);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}
