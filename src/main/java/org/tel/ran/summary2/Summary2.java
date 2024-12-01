package org.tel.ran.summary2;

import java.util.Random;

public class Summary2 {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        Cat fluffy = new Cat("Fluffy", 5);
        Cat milo = null;
        Cat tabby = generateCat("Tabby", 2);
        System.out.println("fluffy = " + fluffy);
        System.out.println("kitty = " + kitty);
        System.out.println("milo = " + milo);
        System.out.println("tabby = " + tabby);
        kitty.setName("Kitty");
        kitty.setAge(new Random().nextInt(0,15));
        milo = new Cat("Milo", 10);
        System.out.println("kitty = " + kitty);
        System.out.println("milo = " + milo);
        kitty.meow();
        fluffy.meow();
        milo.meow();
        tabby.meow();
        System.out.println("Should cat " + kitty.getName() + " go to the vet? \n" + kitty.seeVet());
        System.out.println("Should cat " + fluffy.getName() + " go to the vet? \n" + fluffy.seeVet());
        System.out.println("Should cat " + milo.getName() + " go to the vet? \n" + milo.seeVet());
        System.out.println("Should cat " + tabby.getName() + " go to the vet? \n" + tabby.seeVet());
    }

    static private Cat generateCat(String name, int age){
        return new Cat(name, age);
    }
}
