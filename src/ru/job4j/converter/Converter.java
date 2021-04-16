package ru.job4j.converter;

public class Converter {
    /** Метод конвертации рублей в евро
     *
     * @param value - рубли для конвертации в евро
     * @return евро
     */
    public static float rubleToEuro(int value) {
        return (float) value / 70;
    }

    /**Метод, для конвертации рублей в доллары
     *
     * @param value - рубли
     * @return доллары
     */
    public static float rubleToDollar(int value) {
        return (float) value / 60;
    }

    /**
     * сравнение вещественных чисел с точностью до второго знака, так как имеет смысл сравнивать только до копеек
     */
    public static void main(String[] args) {
        float expect = 2f;

        boolean test = Math.abs(Converter.rubleToEuro(140) - expect) <= 1e-2;
        System.out.printf("140 rubles are %.2f euro\n", Converter.rubleToEuro(140));
        System.out.println("rubleToEuro test = " + test);

        expect = 2.33f;
        test = Math.abs(Converter.rubleToDollar(140) - expect) <= 1e-2;
        System.out.printf("140 rubles are %.2f dollar\n", Converter.rubleToDollar(140));
        System.out.println("rubleToDollar test = " + test);
    }
}
