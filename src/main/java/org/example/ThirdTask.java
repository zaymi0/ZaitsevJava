package org.example;

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int[] array = new  int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
