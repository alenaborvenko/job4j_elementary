package ru.job4j.loop;

public class Mortgage {
    /** Метод, считающий сколько лет потребуется, чтобы погасить кредит
     * пересчитываем задолженность, как задолженность начальная + проценты - то,что погасили
     * @param amount- сумма кредита
     * @param salary - годовой доход
     * @param percent - проценты
     * @return сколько лет потребуется, чтобы погасить кредит
     */
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + (percent / 100) * amount - salary;
            year++;
        }
        return  year;
    }
}
