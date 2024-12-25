package org.tel.ran.lesson12;

import java.util.Arrays;
import java.util.Random;

public class Lesson12 {
    public static void main(String[] args) {
        Human human = new Human(1,"Nik",22, new Pet(1,  "Fluffy"));
        System.out.println(human.pet.name);

        Random random = new Random();
        Ornament ornament1 = new Ornament("ball","red", "Snowflake", random.nextInt(100));
        Ornament ornament2 = new Ornament("ball","gold", "Fairy Tale", random.nextInt(100));
        Ornament ornament3 = new Ornament("stuffed animal","brown", "Teddy", random.nextInt(100));
        Ornament[] ornaments = {ornament1, ornament2, ornament3};
        ChristmasTree christmasTree = new ChristmasTree(175,5,25,ornaments);
        System.out.println("christmasTree = " + christmasTree);

        CustomObject[] customObjects = CustomObject.generateObject();
        for (int i = 0; i < customObjects.length; i++) {
            System.out.println("customObjects[" + i + "] = " + customObjects[i]);
        }

        //System.out.println("CustomObject.generateObject() = " + Arrays.toString(CustomObject.generateObject()));

    }
}
