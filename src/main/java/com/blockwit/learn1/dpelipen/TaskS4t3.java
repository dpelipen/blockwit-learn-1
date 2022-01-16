package com.blockwit.learn1.dpelipen;

import java.util.Scanner;

public class TaskS4t3 {
    public static void main(String[] args) {
        String[] names = new String[4];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имена четырех друзей: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = in.nextLine();
        }
        int[] birthDate = new int[4];
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите даты рождения четырех друзей: ");

        for (int i = 0; i < birthDate.length; i++) {
            birthDate[i] = 2022 - inp.nextInt();
        }

        for (int i = 0; i < birthDate.length; i++) {

            System.out.println(names[i] + "," +" " + birthDate[i] + " лет");


        }
    }
}