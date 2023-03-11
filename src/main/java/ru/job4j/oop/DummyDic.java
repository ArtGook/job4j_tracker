package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String rsl = "Неизвестное слово." + eng;
        return rsl;
    }

    public static void main(String[] args) {
        DummyDic men = new DummyDic();
        String say = men.engToRus("women");
        System.out.println(say);
    }
}
