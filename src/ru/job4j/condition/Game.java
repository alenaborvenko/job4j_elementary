package ru.job4j.condition;

public class Game {

    public static void menu(String name) {

        if ("super mario".equals(name)) { /* сравниваем переменную name с "super mario" */
            System.out.println("Start - super mario");
        } else if ("tanks".equals(name)) { /* Сравнить переменную name с "tanks" */
            System.out.println("Start - tanks");
        } else if ("tetris".equals(name)) { /* Сравнить переменную name с "tetris" */
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tetris");
    }
}
