package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        int num = 3;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до " + num);
            int matches = Integer.parseInt(input.nextLine());
            if (0 < matches && matches < 4 && count >= matches) {
                count = count - matches;
                System.out.println("Спичек осталось: " + count);
                if (count > 0 && count < 3) {
                    num = count;
                }
                turn = !turn;
            } else if (count > 0 && count < 3) {
                num = count;
                System.out.println("Столько спичек нет. Введите другое число");
            } else {
                System.out.println("Введите другое число");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
