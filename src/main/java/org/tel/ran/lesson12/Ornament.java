package org.tel.ran.lesson12;

public class Ornament {
    String shape;
    String color;
    String name;
    int price;

    public Ornament(String shape, String color, String name, int price) {
        this.shape = shape;
        this.color = color;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ornament{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
