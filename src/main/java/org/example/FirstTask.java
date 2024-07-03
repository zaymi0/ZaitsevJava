package org.example;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();

        if(a < b) {
            System.out.println(a + " < " + b);
        } else if(a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
}
