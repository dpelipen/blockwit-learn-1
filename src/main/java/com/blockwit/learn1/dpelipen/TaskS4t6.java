package com.blockwit.learn1.dpelipen;

import java.util.Scanner;

public class TaskS4t6 {
    public static void main(String[] args) {
        int [] numbers = new int [4];
        System.out.println("Введите четыре числа: ");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = in.nextInt();
        }
        int num = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = num;

        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        in.close();
    }
}
