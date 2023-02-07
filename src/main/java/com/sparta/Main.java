package com.sparta;

public class Main {
    public static void main(String[] args) {

        int[] array = {4, 6, 1, 3, 2, 5};

        BubbleSorter sortList = new BubbleSorter();

        sortList.bubbleSort(array);

        for(int i : array) {
            System.out.println(i);
        }
    }
}