package com.blockwit.learn1.dpelipen;

import java.util.Scanner;

public class TaskS4t2 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имена пяти друзей: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = in.nextLine();
        }
        for (String name : names) {
            System.out.println("Ваш друг " + name);
        }
    }

}
