package ru.job4j.loop;

public class Fitness {
    // ivan - сила тяги Ивана, увеличивается в 3 раза за месяц
    // nik - сила тяги Николая, увеличивается в 2 раза за месяц
    public static int calc(int ivan, int nik) {
    int month = 0;
    while (ivan <= nik) {
        month++;
        ivan *= 3;
        nik *= 2;
    }
    return month;
    }
}
