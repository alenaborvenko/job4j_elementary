package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    /**  Посчитать сдачу (есть монетки номиналом 10, 5, 2, 1 )
     *
     * @param money - начальное количество денег
     * @param price - цена
     * @return - массив монеток с расчитанной сдачей
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coin : coins) {
            while (change > 0 && change >= coin) {
                rsl[size++] = coin;
                change -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
