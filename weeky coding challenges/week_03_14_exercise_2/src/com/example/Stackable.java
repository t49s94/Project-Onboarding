package com.example;

public interface Stackable<T> {
    void push(T value);
    T pop();
    int max();
}
