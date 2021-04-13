package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        // число 1 не является ни простым числом, ни составным. У него всего 1 делитель. И для числа 1 надо вернуть false
        boolean prime = number != 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
