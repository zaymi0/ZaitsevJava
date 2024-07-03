package org.example;

public class SecondTask {
    String firstLine;
    String secondLine;

    public SecondTask(String firstLine, String secondLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    public void stringComparison() {
        if (firstLine.equals(secondLine)){
            System.out.println("строки идентичны");
        } else {
            System.out.println("строки не идентичны");
        }

    }
}
