package org.tel.ran.lesson9;

import java.util.Stack;

public class StackOverflow {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        for (int i = 1; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("stack = " + stack);
        int temp = stack.pop();
        System.out.println("stack.pop = " + temp);


    }
}
