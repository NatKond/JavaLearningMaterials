package org.tel.ran.Tasks._03_12_2024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTasks {

    // 1. Найти сумму элементов массива.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }

    // 2. Найти минимальный элемент массива.
    public static void task2() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }

    // 3. Найти максимальный элемент массива.
    public static void task3() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }

    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));

        int minI = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minI]) {
                    minI = i;
            }
        }
        System.out.println("minI = " + minI);
    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));

        int maxI = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxI]) {
                maxI = i;
            }
        }
        System.out.println("maxI = " + maxI);

    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        System.out.println("array = " + Arrays.toString(array));

        int countPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPos++;
            }
        }
        System.out.println("countPos = " + countPos);
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};
        System.out.println("array = " + Arrays.toString(array));

        int countNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNeg++;
            }
        }
        System.out.println("countNeg = " + countNeg);
    }

    // 8. Посчитать количество четных элементов.
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        System.out.println("array = " + Arrays.toString(array));

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("countEven = " + countEven);

    }

    // 9. Посчитать количество нечетных элементов.
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        System.out.println("array = " + Arrays.toString(array));

            int countOdd = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    countOdd++;
                }
            }
            System.out.println("countOdd = " + countOdd);
    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);

        boolean containsTarget = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                containsTarget = true;
            }
        }
        System.out.println("containsTarget = " + containsTarget);
    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        double arithmeticMean = sum/array.length;
        System.out.println("arithmeticMean = " + arithmeticMean);
    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        double arithmeticMean = sum/array.length;
        System.out.println("arithmeticMean = " + arithmeticMean);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > arithmeticMean){
                System.out.println("array[" + i + "] = " + array[i] + " is bigger than arithmeticMean");
            }
        }
    }

    // 13. Проверить, упорядочен ли массив по возрастанию.
    public static void task13() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        boolean isMonotone = true;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]){
                isMonotone = false;
            }
        }
        System.out.println("isMonotone = " + isMonotone);
    }

    // 14. Найти второй по величине элемент массива.
    public static void task14() {
        int[] array = {4, 3, 2, 1};
        System.out.println("array = " + Arrays.toString(array));

        int min = array[0];
        int min2 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            /*if (array[i] < min){
                min2 = min;
                min = array[i];
            }

            if (array[i] < min2 && array[i] > min){
                min2 = array[i];
            }*/
        }

        if (min2 == min){
            min2 = array[1];
        }

        for (int i = 1; i < array.length; i++) {
            if ((array[i] < min2) && (array[i] > min)){
                min2 = array[i];
            }
        }

        System.out.println("min2 = " + min2);
    }

    // 15. Переставить элементы массива в обратном порядке.
    public static void task15() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[array.length-i-1] = array[i];
        }
        System.out.println("reverse = " + Arrays.toString(reverse));
    }
}