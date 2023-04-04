package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Lionel Andres Messi");
        student.setGroup("RA-18-5");
        student.setCreated(new Date());

        System.out.println(student.getFullName() + " studying in a group: " + student.getGroup() + " date of admission: " + student.getCreated());
    }
}
