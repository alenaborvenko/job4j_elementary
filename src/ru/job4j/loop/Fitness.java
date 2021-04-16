package ru.job4j.loop;

public class Fitness {
    /** Метод, считающий сколько месяцев потребуется Ивану, чтобы обогнать Николая в силе тяге
     *     ivan - сила тяги Ивана, увеличивается в 3 раза за месяц
     *     nik - сила тяги Николая, увеличивается в 2 раза за месяц
     * @param ivan сила тяги Ивана
     * @param nik сила тяги Николая
     * @return количество месяцев, которые нужно Ивану, чтобы обойти Николая в силе тяге
     */

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
