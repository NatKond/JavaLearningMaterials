package org.tel.ran.lesson8;

public class Unary {
    private int number;

    public Unary(int number) {
        this.number = number;
    }

    public Unary() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void doMinus() {
        number = -number;
    }

    public void decrement() {
        number--; //number = number - 1
    }

    public void increment() {
        number++;
    }

    public boolean equals(Unary u){
        return u.getNumber() == number;
    }

    @Override
    public String toString() {
        return "Unary{" +
                "number=" + number +
                '}';
    }
}
