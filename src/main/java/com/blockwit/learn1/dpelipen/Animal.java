package com.blockwit.learn1.dpelipen;

public class Animal {
    int birthDate;
    String color;
    String name;

    public void age(int birthDate) {
       int age = 2022 - birthDate;
        System.out.println("Животному " + age+" лет");
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.age(2003);

    }
}

