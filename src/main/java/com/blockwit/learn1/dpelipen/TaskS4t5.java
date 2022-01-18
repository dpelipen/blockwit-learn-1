package com.blockwit.learn1.dpelipen;

import java.util.Scanner;

public class TaskS4t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество друзей цифрой:");
        int size = in.nextInt();
        in.nextLine();
        String [] names = new String[size];
        System.out.println("Введите имена друзей:");
        for(int i= 0; i<size; i++){
            names[i] = in.nextLine();
        }
        for (int i = names.length-1; i>=0; i--){
            System.out.println(names[i]);
        }
        in.close();
    }

}
