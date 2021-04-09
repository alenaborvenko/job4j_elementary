package ru.job4j;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {
    public static void main(String[] args) {
        SimpleDateFormat currentDate = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(currentDate.format(new Date()));
    }
}
