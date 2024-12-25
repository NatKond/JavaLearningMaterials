package org.tel.ran.lesson14;

import java.util.Arrays;

public class Post {
    private int weight;
    private Address address;

    public Post(int weight, Address address) {
        this.weight = weight;
        this.address = address;
    }

    public void doSm(String... s){
        for (String string : s) {
            System.out.println("s = " + string + ";");
        }
    }

    @Override
    public String toString() {
        return "Post{" +
                "weight=" + weight +
                ", address=" + address +
                '}';
    }
}

