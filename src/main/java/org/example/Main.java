package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        FirstTask firstTask = new FirstTask(scanner.nextInt(),scanner.nextInt());
        firstTask.сomparisonNumbers();
        firstTask.arithmeticOperations();
        System.out.println("Введите две строки");
        scanner.nextLine();
        SecondTask secondTask = new SecondTask(scanner.nextLine(), scanner.nextLine());
        secondTask.stringComparison();
        ThirdTask thirdTask = new ThirdTask(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        thirdTask.outputEvenNumbers();
    }
}