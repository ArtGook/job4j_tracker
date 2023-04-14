package ru.job4j.poly;

public interface Transport {
    boolean go();

    int passengers(int num);

    int fuel(int liters);

}
