package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", 1000);
        Book kolobok = new Book("Kolobok", 5);
        Book bible = new Book("Bible", 500);
        Book cleanCode = new Book("Clean Code", 50);
        Book[] books = new Book[4];
        books[0] = warAndPeace;
        books[1] = kolobok;
        books[2] = bible;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("After the exchange");
        Book swap = books[0];
        books[0] = books[3];
        books[3] = swap;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Books with the title 'Clean code'");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean Code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
