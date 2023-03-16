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

    public int sumAllOperation() {
        return sum(10) + minus(25) + multiply(5) + divide(20);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator del = new Calculator();
        Calculator sumAll = new Calculator();
        int rslTwo = del.divide(20);
        int rsl = calculator.multiply(5);
        int rslOne = Calculator.minus(25);
        int result = Calculator.sum(10);
        int rslThree = sumAll.sumAllOperation();
        System.out.println(result);
        System.out.println(rsl);
        System.out.println(rslOne);
        System.out.println(rslTwo);
        System.out.println(rslThree);
    }
}
