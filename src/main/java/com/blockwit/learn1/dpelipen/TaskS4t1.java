package com.blockwit.learn1.dpelipen;

import java.util.Scanner;

public class TaskS4t1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш год рождения :");
        int birthDate = in.nextInt();
        System.out.println("Введите ваше имя :");
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        int age = 2021 - birthDate;
        System.out.println(name + ", вам" + " " + age + " лет");


    }
}