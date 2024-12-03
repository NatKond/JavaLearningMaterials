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
            if (array[i] ==0 ){
                countZero++;
            }
        }

        int[] reducedArray = {array.length - countZero};

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {

            }
        }

    }

    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30, 23};
        int divisor = 5;

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, -3, 4, -5};
        int intNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                intNeg = i;
                break;
            }
        }
        System.out.println("intNeg = " + intNeg);
    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        int summEven = 0;
        for (int i = 0; i < array.length; i++) {
            if( i % 2 == 0){
                summEven += array[i];
            }
        }
        System.out.println("summEven = " + summEven);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3};
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

    }

    public static void main(String[] args) {
    }
}