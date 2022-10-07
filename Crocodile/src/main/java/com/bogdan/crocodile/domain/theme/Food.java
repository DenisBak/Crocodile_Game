/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain.theme;

import java.util.Random;


public enum Food implements Theme {
    INSTANCE(),
    PINEAPPLE("Aнaнac"),
    BANANA("Бaнaн"),
    CACAO("Kaкao"),
    COFFEE("Kофe"),
    LIMON("Лимoн"),
    MILK("Moлoкo"),
    CUCUMBER("Oгypeц"),
    NUT("Opex"),
    TOMATO("Пoмидop"),
    SWEET("Caxap"),
    BREAD("Xлeб"),
    EGG("Яйцo");

    @Override
    public String getNextWord() {
        return values[new Random().nextInt(1, values.length)].getWord();
    }

    public String getWord() {
        return word;
    }

    private static Food[] values = Food.values();


    private String word;

    Food(String word) {
        this.word = word;
    }

    Food() {

    }
}
