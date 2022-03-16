package com.example;

public class Stack<T> implements Stackable<T>{

    private Stack<T> previous;
    private T value;

    Stack() {

    }

    Stack(T value) {
        this.value = value;
    }

    Stack(Stack<T> previous, T value){
        this.previous  = previous;
        this.value = value;
    }

    @Override
    public void push(T value) {
        this.previous = new Stack<T>(this.previous, this.value);
        this.value = value;
    }

    @Override
    public T pop() {
        if(this.previous == null)
            throw new IllegalArgumentException("Stack is empty!");

        T top = this.value;
        this.value = this.previous.value;
        this.previous = this.previous.previous;

        return top;
    }

    @Override
    public int max() {
        int maxValue = 0;

        for(Stack<T> stack = this; stack.previous != null; stack = stack.previous) {
            if((int)stack.value > maxValue) {
                maxValue = (int)stack.value;
            }
        }

        return maxValue;
    }
}
