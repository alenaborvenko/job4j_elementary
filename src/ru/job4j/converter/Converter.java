package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(int value) {
        return value > 0 ? (float) value / 70 : 0;
    }

    public static float rubleToDollar(int value) {
        return value > 0 ? (float) value / 60 : 0;
    }

    public static void main(String[] args) {
        float expect = 2f;
        // сравнение вещественных чисел с точностью до второго знака, так как имеет смысл сравнивать только до копеек
        boolean test = Math.abs(Converter.rubleToEuro(140) - expect) <= 1e-2;
        System.out.printf("140 rubles are %.2f euro\n", Converter.rubleToEuro(140));
        System.out.println("rubleToEuro test = " + test);

        expect = 2.33f;
        test = Math.abs(Converter.rubleToDollar(140) - expect) <= 1e-2;
        System.out.printf("140 rubles are %.2f dollar\n", Converter.rubleToDollar(140));
        System.out.println("rubleToDollar test = " + test);
    }
}
