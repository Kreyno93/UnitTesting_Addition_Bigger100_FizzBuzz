package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void addition() {
        //GIVEN
        int a = 2;
        int b = 3;
        //WHEN
        int actual = Main.addition(a, b);
        //THEN
        assertEquals(5, actual);
    }

    @Test
    void checkNumberBiggerThan100_ReturnTrue() {
        //GIVEN
        int number = 101;
        //WHEN
        boolean actual = Main.checkNumberBiggerThan100(number);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void checkNumberSmallerThan100_ReturnFalse() {
        //GIVEN
        int number = 99;
        //WHEN
        boolean actual = Main.checkNumberBiggerThan100(number);
        //THEN
        assertEquals(false, actual);
    }

    @Test
    void checkNumberEquals100_ReturnFalse() {
        //GIVEN
        int number = 100;
        //WHEN
        boolean actual = Main.checkNumberBiggerThan100(number);
        //THEN
        assertEquals(false, actual);
    }

    @Test
    void fizzBuzz_ReturnFizz() {
        //GIVEN
        int number = 3;
        //WHEN
        String actual = Main.fizzBuzz(number);
        //THEN
        assertEquals("Fizz", actual);
    }

    @Test
    void fizzBuzz_ReturnBuzz() {
        //GIVEN
        int number = 5;
        //WHEN
        String actual = Main.fizzBuzz(number);
        //THEN
        assertEquals("Buzz", actual);
    }

    @Test
    void fizzBuzz_ReturnFizzBuzz() {
        //GIVEN
        int number = 15;
        //WHEN
        String actual = Main.fizzBuzz(number);
        //THEN
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void fizzBuzz_ReturnNumber() {
        //GIVEN
        int number = 1;
        //WHEN
        String actual = Main.fizzBuzz(number);
        //THEN
        assertEquals("1", actual);
    }
}