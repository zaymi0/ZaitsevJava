package org.example;

public class FirstTask {
    int a;
    int b;

    public FirstTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void сomparisonNumbers() {
        if(a < b) {
            System.out.println(a + " < " + b);
        } else if(a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }

    public void arithmeticOperations() {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
