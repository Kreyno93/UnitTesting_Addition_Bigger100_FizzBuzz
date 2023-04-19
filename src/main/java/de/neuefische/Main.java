package de.neuefische;

public class Main {
    public static void main(String[] args) {

    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static boolean checkNumberBiggerThan100(int number) {
        return number > 100;
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}