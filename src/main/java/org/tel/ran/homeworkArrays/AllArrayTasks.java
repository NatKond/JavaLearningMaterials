package org.tel.ran.homeworkArrays;

import java.util.Arrays;

public class AllArrayTasks {
    int[] array;
    int target;
    int targetSym;
    int divisor;


    public static void task1() {
        System.out.println("1. Найти сумму элементов массива.");
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }

    public static void task2() {
        System.out.println("2. Найти минимальный элемент массива.");
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

    public static void task3() {
        System.out.println("3. Найти максимальный элемент массива.");
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

    public static void task4() {
        System.out.println("4. Найти индекс минимального элемента массива.");
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

    public static void task5() {
        System.out.println("5. Найти индекс максимального элемента массива.");
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

    public static void task6() {
        System.out.println("6. Посчитать количество положительных элементов.");
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

    public static void task7() {
        System.out.println("7. Посчитать количество отрицательных элементов.");
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

    public static void task8() {
        System.out.println("8. Посчитать количество четных элементов.");
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

    public static void task9() {
        System.out.println("9. Посчитать количество нечетных элементов.");
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

    public static void task10() {
        System.out.println("10. Проверить, есть ли в массиве заданное число.");
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

    public static void task11() {
        System.out.println("11. Найти среднее арифметическое элементов массива.");
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        double arithmeticMean = sum/array.length;
        System.out.println("arithmeticMean = " + arithmeticMean);
    }

    public static void task12() {
        System.out.println("12. Вывести все элементы массива, которые больше среднего значения.");
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

    public static void task13() {
        System.out.println("13. Проверить, упорядочен ли массив по возрастанию.");
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

    public static void task14() {
        System.out.println("14. Найти второй по величине элемент массива.");
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

    public static void task15() {
        System.out.println("15. Переставить элементы массива в обратном порядке.");
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[array.length-i-1] = array[i];
        }
        System.out.println("reverse = " + Arrays.toString(reverse));
    }

    public static void task16() {
        System.out.println("16. Найти все пары элементов, сумма которых равна заданному числу.");
        int[] array = {1, 2, 3, 4, 5};
        int targetSum = 6;
        System.out.println("array = " + Arrays.toString(array) + ", targetSum = " + targetSum);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array [j] == targetSum){
                    System.out.println("array[" + i + "] + array [" + j + "] = " + array[i] + " + " + array[j] + " = "  + (array[i] + array[j]));
                }
            }
        }
    }

    public static void task17() {
        System.out.println("17. Проверить, есть ли в массиве дубликаты.");
        int[] array = {1, 2, 3, 4, 2};
        System.out.println("array = " + Arrays.toString(array));
        boolean hasDuplicates = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) {
                break;
            }
        }
        System.out.println("hasDuplicates = " + hasDuplicates);
    }

    public static void task18() {
        System.out.println("18. Удалить все нули из массива и сдвинуть элементы влево.");
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

    public static void task20() {
        System.out.println("20. Найти количество чисел, делящихся на заданное число без остатка.");
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

    public static void task21() {
        System.out.println("21. Упорядочить массив по возрастанию.");
        int[] array = {4, 2, 7, 1, 3};
        System.out.println("array = " + Arrays.toString(array));

        /*for (int i = 0; i < array.length; i++) {

            int indexMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[indexMin] > array[j]) {
                    indexMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexMin];
            array[indexMin]=temp;

        }*/

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
        System.out.println("array = " + Arrays.toString(array));
    }

    public static void task22() {
        System.out.println("22. Найти индекс первого отрицательного элемента.");
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

    public static void task23() {
        System.out.println("23. Подсчитать сумму чисел на четных индексах.");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int sumEvenI = 0;
        for (int i = 0; i < array.length; i += 2) {
            sumEvenI += array[i];
        }
        System.out.println("sumEvenI = " + sumEvenI);
    }

    public static void task24() {
        System.out.println("24. Найти произведение всех элементов массива.");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int mul = array[0];
        for (int i = 1; i < array.length; i++) {
            mul *=array[i];
        }
        System.out.println("mul = " + mul);
    }

    public static void task25() {
        System.out.println("25. Переместить все отрицательные числа в конец массива.");
        int[] array = {1, -2, 3, -4, 7};
        System.out.println("array = " + Arrays.toString(array));

        int end = array.length - 1;
        for (int i = 0; i < end; i++) {
            if (array[i] < 0) {
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;
                end--;
            }
        }
        System.out.println("array = " + Arrays.toString(array));
    }

    public static void task26() {
        System.out.println("26. Найти количество уникальных элементов в массиве.");
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int countUniqueValue = 0;
        boolean isUnique = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && j != i) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                countUniqueValue++;
            } else {
                isUnique = true;
            }
        }
        System.out.println("countUniqueValue = " + countUniqueValue);
    }

    public static void task27() {
        System.out.println("27. Переставить минимальный элемент массива в начало.");
        int[] array = {3, 2, 1, 4, 5};
        System.out.println("array = " + Arrays.toString(array));

        int minI = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minI]) {
                minI = i;
            }
        }
        int temp = array[minI];
        array[minI] = array[0];
        array[0] = temp;
        System.out.println("array = " + Arrays.toString(array));
    }

    public static void task28() {
        System.out.println("28. Найти длину самой длинной последовательности одинаковых элементов.");
        int[] array = {1, 1, 2, 2, 2, 3, 3};
        System.out.println("array = " + Arrays.toString(array));

        int maxSequenceLength = 0;
        for (int i = 0; i < array.length; i++) {
            int j = 1;
            while (i + j < array.length && array[i] == array [i + j]){
                j++;
            }
            i = i + j - 1;
            if (j > maxSequenceLength) {
                maxSequenceLength = j;
            }
        }
        System.out.println("maxSequenceLength = " + maxSequenceLength);
    }

    public static void task29() {
        System.out.println("29. Найти сумму положительных элементов, расположенных после первого отрицательного.");
        int[] array = {1, -2, 3, 4, -5};
        System.out.println("array = " + Arrays.toString(array));
        int indFirstZero = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                indFirstZero = i;
                break;
            }
        }

        for (int i = indFirstZero; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("sum = " + sum);
    }

    public static void task30() {
        System.out.println("30. Удалить все дубликаты из массива.");
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("array = " + Arrays.toString(array));

        boolean isDublicate = false;
        int countUniqueValue = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (array[i] == array[j]) {
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                countUniqueValue++;
            } else {
                isDublicate = false;
            }
        }

        int[] reducedArray = new int [countUniqueValue];
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (array[i] == array[j]) {
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                reducedArray[k] = array[i];
                k++;
            } else {
                isDublicate = false;
            }
        }
        array = reducedArray;
        System.out.println("array = " + Arrays.toString(array));
    }

    public static void doAllTasks(){

    }

}
