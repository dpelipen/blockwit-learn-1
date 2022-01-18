package com.blockwit.learn1.dpelipen;

public class WordsHelper {
    //Можно сделать метод статическим, чтобы не создавать экземпляр класса
    public void printRubleWord(int rub){
        String s;
        if (rub % 10 == 1) s = "рубль";
        else if (rub % 10 >= 2 && rub % 10 <= 4) s = "рубля";
        else {
            s = "рублей";
        }
        System.out.println(s);

    }
}
