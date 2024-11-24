package org.tel.ran.summary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Summary {
    private static void hello(String name) {
        System.out.println("Hello " + name + "!");
    }
    private static final int TEST_CONSTANT = 10;
    public static void main(String[] args) {
        System.out.println("There are " + Cat.counter + " cats");
        Cat cat1 = new Cat();
        cat1.name = "Fluffy";
        cat1.age = 5;

        Cat cat2 = new Cat ("Kitty", 10);
        Cat cat3 = new Cat (3, "Box");
        cat1.meow();
        cat2.meow();
        cat3.meow();
        System.out.println("There are " + Cat.counter + " cats");

        Calculator calculator = new Calculator();
        System.out.println(calculator.a);
        System.out.println(calculator.b);

        int a = 10;
        int b = 20;
        calculator.printAllCalculate(a,b);

        String name = "John";
        hello(name);

        char ch = 'a';
        double asciiVAlue = ch;
        float c = 10.7f;
        double sum = ch + c;
        System.out.println("asciiValue = " + asciiVAlue);
        System.out.println("sum = " + sum);

        int x = Integer.MAX_VALUE;
        byte y = (byte)x;

        Integer z = 1520;
        System.out.println("IntegerMax = " + x);
        System.out.println("Byte.Max = " + y);
        System.out.println(z.toString());


    }
}
