package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 78, 41, 11, 65};
        boolean is = false;
        double num = 100.0D;
        int[] var5 = array;
        int var6 = array.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            int i = var5[var7];
            if ((double)i == num) {
                is = true;
            }
        }

        System.out.println(is);
    }
}