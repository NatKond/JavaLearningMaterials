package org.tel.ran.lesson14;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Lesson14 {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Postman postman1 = new Postman();
        Post post = new Post(23,new Address("London", "Baker street","221b",faker.bothify("1#####")));

        postman1.delivery(post);
        post.doSm("first word", "second word", "third word");

        //Есть сто дверей. При каждом проходе мы меняем состояние двери, если ее номер делится нацело на номер прохода.
        // Какие двери будут открыты при сотом походе?
        boolean[] doors = new boolean[101];
        for (int j = 1; j < 101; j++) {
            for (int i = 1; i < 101; i++) {
                if (i % j == 0) {
                    doors[i] = !doors[i];
                }
            }
        }
        for (boolean door : doors){
            if (door) {
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
        for (int i = 0; i < doors.length; i++) {
            if (doors[i]) {
                System.out.println("i = " + i);
            }
        }

        String str = faker.bothify("########");
        System.out.println("str = " + str);
        int[] array = new int[str.length()];
        for (int i = 0; i < array.length; i++) {
            //array[i] = str.charAt(i) - '0';
            array[i] = Character.getNumericValue(str.charAt(i));
        }
        System.out.println("array = " + Arrays.toString(array));
    }
}
