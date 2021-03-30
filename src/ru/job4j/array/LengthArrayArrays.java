package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {7, 3}, {3, 5, 4}, {3, 4, 5, 6}};
        for (int[] number : numbers) {
            System.out.println(number.length);
        }
    }
}
