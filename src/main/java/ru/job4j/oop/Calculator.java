package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int p) {
        return p / x;
    }

    public int sumAllOperation(int o) {
        return sum(o) + minus(o) + multiply(o) + divide(o);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(1));
        System.out.println(minus(2));
        System.out.println(calculator.multiply(3));
        System.out.println(calculator.divide(20));
        System.out.println(calculator.sumAllOperation(10));
    }
}
