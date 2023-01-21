package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

//        for (int num :
//                numbers) {
//            System.out.print(num + " ");
//        }

        System.out.println(Arrays.toString(numbers));
    }
}