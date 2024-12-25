package org.tel.ran.lesson12;

import java.util.Arrays;

public class ChristmasTree {
    int height;
    int age;
    int weight;
    Ornament[] ornaments;

    public ChristmasTree (int height, int age, int weight, Ornament[] ornaments) {
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.ornaments = ornaments;
    }

    public ChristmasTree() {
        this(0,0,0,null);
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                ", ornaments=" + Arrays.toString(ornaments) +
                '}';
    }
}
