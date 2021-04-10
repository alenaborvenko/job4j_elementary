package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 193;
        short heightWoman = 172;
        System.out.printf("Man %s is %.2f\n", heightMan, Fit.manWeight(heightMan));
        System.out.printf("Woman %s is %.2f\n", heightWoman, Fit.womanWeight(heightWoman));
    }
}
