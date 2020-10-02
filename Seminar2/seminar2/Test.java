package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 3, 78, 41, 11, 65};
        double average = 100 ;
        double sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        average = sum / array.length;
        System.out.println(average);
    }
}
