package ru.job4j.loop;

public class CheckPrimeNumber {
    /** Метод, проверяющий простое ли число
     *    число 1 не является ни простым числом, ни составным. У него всего 1 делитель. И для числа 1 надо вернуть false
     *   простые числа - только НАТУРАЛЬНЫЕ числа по определению
     * @param number - проверяемое число
     * @return boolean простое или не простое
     */
    public static boolean check(int number) {

        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
