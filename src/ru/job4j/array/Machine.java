package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int index = 0; index < coins.length; index++) {
            while (change - coins[index] >= 0) {
                rsl[size] = coins[index];
                change = change - coins[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}