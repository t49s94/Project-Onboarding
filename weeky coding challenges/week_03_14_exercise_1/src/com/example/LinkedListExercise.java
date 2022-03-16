package com.example;

import java.util.*;

public class LinkedListExercise {

    public static Integer getIntersectNode(LinkedList<Integer> listA, LinkedList<Integer> listB) {
        Iterator<Integer> iteratorA = listA.iterator();
        while(iteratorA.hasNext()){
            Integer node = iteratorA.next();

            Iterator<Integer> iteratorB = listB.iterator();

            while(iteratorB.hasNext()){
                if(node == iteratorB.next()) {
                    return node;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        LinkedList<Integer> listA=new LinkedList<Integer>();
        listA.add(3);
        listA.add(7);
        listA.add(8);
        listA.add(10);

        LinkedList<Integer> listB=new LinkedList<Integer>();
        listB.add(99);
        listB.add(1);
        listB.add(8);
        listB.add(10);

        Integer node = getIntersectNode(listA, listB);
        System.out.println(node);
    }
}
