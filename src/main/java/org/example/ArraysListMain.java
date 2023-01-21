package org.example;

import java.util.ArrayList;

public class ArraysListMain {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>(1);

        integerArrayList.add(213);
        integerArrayList.add(23);
        integerArrayList.add(342);
        integerArrayList.add(21);
        integerArrayList.add(432);

        System.out.println(integerArrayList.contains(213));
        System.out.println(integerArrayList);

    }
}
