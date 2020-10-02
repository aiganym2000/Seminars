package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 78, 41, 11, 65};
        boolean is = false;
        double num = 100.0D;

        for(int i = 0; i < array.length; i++) {
            int i = array[i];
            if ((double)i == num) {
                is = true;
            }
        }

        System.out.println(is);
    }
}