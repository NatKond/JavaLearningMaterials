package org.tel.ran.lesson9;

import java.util.Arrays;
import java.util.Random;

public class NewClass {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if ((i < 20) && (i >= 0)) {
                System.out.println("i = " + i + " is less than 20");
            } else if ((i > 20) && (i < 40)) {
                System.out.println("i = " + i + " is more than 20 and less than 40");
            } else {
                System.out.println("i = " + i + " in more than 40");
            }
        }

        int x = 5;
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        System.out.println("f = " + f);
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(11);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr1[last] = " + arr[arr.length-1]);

        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.println("arr[j] = " + j + " is even");
            }
        }
    }
}