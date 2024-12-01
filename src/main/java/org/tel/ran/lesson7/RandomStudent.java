package org.tel.ran.lesson7;

import java.util.Random;

public class RandomStudent {
    public static int chooseStudent(int count){
        Random studentNumber = new Random();
        return studentNumber.nextInt(2, count);
    }
}
