package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
    }

    @Override
    public void passengers(int num) {
        System.out.println("Количество пассажиров = " + num);
    }

    @Override
    public int fuel(int liters) {
        return liters * 50;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.go();
        bus.passengers(10);
        System.out.println("Цена бензина: " + bus.fuel(100) + " рублей");
    }
}
