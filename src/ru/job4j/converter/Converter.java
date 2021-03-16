package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int outEuro = Converter.rubleToEuro(in);
        int outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expected == outEuro;
        boolean passedDollar = expected == outDollar;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 2 Dollars. Test result : " + passedDollar);
    }
}