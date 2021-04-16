package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    /** Посчитать сдачу (есть монетки номиналом 10, 5, 2, 1 )
     *
     *-----------------------Жадный алгоритм----------------------------------------------
     * 1. Посчитаем сдачу (change = money - price)
     * 2. Возьмем самый крупный номинал монет (индекс в массиве coins) countCoins = 0
     * 3. Количество отданных монет = 0 (size = 0)
     * 4. Пока надо давать сдачу (change > 0)
     * 4.1.     пока сдача >= номинала монеты
     * 4.1.1.        Запишем в массив монетку.
     * 4.1.2.        Увеличим размер отданных монеток
     * 4.1.3.        Пересчитаем сдачу (change = change - coins[countCoins] и на пункт 4.1
     * 5.       перейдем к следующему номиналу монет (countCoins++) и на пункт 4.
     * ---------------------------------------------------------------------------------------
     * @param money - начальное количество денег
     * @param price - цена
     * @return - массив монеток с расчитанной сдачей
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        int countCoins = 0;
        while (change > 0) {
            // можно переписать на цикл for
            while (change >= coins[countCoins]) {
                rsl[size++] = coins[countCoins];
                change -= coins[countCoins];
            }
            countCoins++;
        }
        return Arrays.copyOf(rsl, size);
    }
}
