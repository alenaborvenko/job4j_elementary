package ru.job4j.condition;

import java.time.LocalDate;

public class Gretting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie.";
        int year = LocalDate.now().getYear();
        idea += year;
        System.out.println(idea);
    }
}
