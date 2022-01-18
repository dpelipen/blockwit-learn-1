package com.blockwit.learn1.dpelipen;

import java.util.Scanner;

public class TaskS4t4 {
    public static void main(String[] args) {
        int[] temp = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру за последние три дня:");
        int sum = 0;
        int degree = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = in.nextInt();
            sum += temp[i];
            degree = sum / 3;

        }

        System.out.println("Средняя температура за три дня " + degree + " градусов");

    }
}
