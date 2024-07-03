package org.example;

public class ThirdTask {
    int[] array;

    public ThirdTask(int[] array) {
        this.array = array;
    }

    public void outputEvenNumbers() {
        for (int i : array) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            
        }
    }
}
