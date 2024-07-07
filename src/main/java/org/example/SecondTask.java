package org.example;

import java.util.Objects;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String firstLine = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String secondLine = scanner.nextLine();

        if (Objects.equals(firstLine, secondLine)) {
            System.out.println("строки идентичны");
        } else {
            System.out.println("строки не идентичны");
        }
    }
}
