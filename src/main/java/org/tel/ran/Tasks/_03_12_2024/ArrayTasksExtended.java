package org.tel.ran.Tasks._03_12_2024;

import java.util.Arrays;

public class ArrayTasksExtended {

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array [j] == target){
                    System.out.println("array[" + i + "] + array [" + j + "] = " + array[i] + " + " + array[j] + " = "  + (array[i] + array[j]));
                }
            }
        }
    }

    // 17. Проверить, есть ли в массиве дубликаты.
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2};
        boolean hasDuplicates = false;
        System.out.println("array = " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
        }
        System.out.println("hasDuplicates = " + hasDuplicates);
    }

    // 18. Удалить все нули из массива и сдвинуть элементы влево.
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};
        System.out.println("array = " + Arrays.toString(array));

        int countZero = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 0 ){
                countZero++;
            }
        }

        int[] reducedArray = new int [array.length - countZero];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                reducedArray[j] = array[i];
                j++;
            }
        }
        array = reducedArray;
        System.out.println("array = " + Arrays.toString(array));
    }

    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30, 23};
        int divisor = 5;
        System.out.println("array = " + Arrays.toString(array) + ", divisor = " + divisor);

        int countDivisible = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                countDivisible++;
            }
        }
        System.out.println("countDivisible = " + countDivisible);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};
        System.out.println("array = " + Arrays.toString(array));

        boolean isArrayOrdered = false;
        while (!isArrayOrdered){
            isArrayOrdered = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array [i+1]) {
                    int temp = array[i];
                    array[i] = array [i+1];
                    array[i+1] = temp;
                    isArrayOrdered = false;
                }
            }
        }
        System.out.println("arrayOrdered = " + Arrays.toString(array));
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, -3, 4, -5};
        System.out.println("array = " + Arrays.toString(array));
        int firstIndNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstIndNeg = i;
                break;
            }
        }
        System.out.println("firstIndNeg = " + firstIndNeg);
    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int summEvenI = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                summEvenI += array[i];
            }
        }
        System.out.println("summEvenI = " + summEvenI);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));
        int mul = array[0];
        for (int i = 1; i < array.length; i++) {
            mul *=array[i];
        }
        System.out.println("mul = " + mul);
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
        System.out.println("array = " + Arrays.toString(array));
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3};
        System.out.println("array = " + Arrays.toString(array));
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
        System.out.println("array = " + Arrays.toString(array));
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
    }

}