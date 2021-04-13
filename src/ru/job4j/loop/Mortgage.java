package ru.job4j.loop;

public class Mortgage {
    //amount - сумма кредита, salary - годовой доход, percent - проценты
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            // пересчитаем задолженность, как задолженность начальная + проценты - то,что погасили
            amount = amount + (percent / 100) * amount - salary;
            year++;
        }
        return  year;
    }
}
