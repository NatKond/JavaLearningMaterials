package org.tel.ran.lesson9;

import java.util.Stack;

public class StackOverflow {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        for (int i = 1; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("stack = " + stack);

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.search(4) = " + stack.search(4));
        for (int i = 1; i < 10; i++) {
            System.out.println("stack.pop() = " + stack.pop());
        }
        System.out.println("stack.empty() = " + stack.empty());


        for (int i = 1; i > 0; i++) {
            stack.push(i);
        }
    }
}
