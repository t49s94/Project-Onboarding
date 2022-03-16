package com.example;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(6);
        stack.push(13);
        stack.push(2);
        stack.push(1);
        stack.push(17);

        System.out.println("Pop method: " + stack.pop());
        System.out.println("Max method: " + stack.max());
    }


}
