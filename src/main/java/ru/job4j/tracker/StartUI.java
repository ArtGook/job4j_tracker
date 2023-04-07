package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item created = new Item();
        Item test = new Item(8, "Arsen");
        System.out.println(created.getCreated());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = created.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
        System.out.println(test.toString());
    }
}
