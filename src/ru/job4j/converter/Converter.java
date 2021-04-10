package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(int value) {
        return (float) value / 70;
    }

    public static float rubleToDollar(int value) {
        return (float) value / 60;
    }

    public static void main(String[] args) {
        System.out.printf("140 rubles are %.2f euro\n", Converter.rubleToEuro(140));
        System.out.printf("140 rubles are %.2f dollar\n", Converter.rubleToDollar(140));
    }
}
