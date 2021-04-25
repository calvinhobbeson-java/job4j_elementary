package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return max(temp, third);
    }

    public static int max(int first, int second, int third, int forth) {
        int temp = max(first, second, third);
        return max(temp, forth);
    }
}