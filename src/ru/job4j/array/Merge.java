package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int first = 0;
        int second = 0;
        int[] rsl = new int[left.length + right.length];
        for (int index = 0; index < rsl.length; index++) {
            if (first < left.length && second < right.length) {
                if (left[first] > right[second]) {
                    rsl[index] = right[second++];
                    } else  {
                    rsl[index] = left[first++];
                }
                } else
                    if (second < right.length) {
                        rsl[index] = right[second++];
            } else {
                        rsl[index] = left[first++];
                    }
        }
        return rsl;
    }
}