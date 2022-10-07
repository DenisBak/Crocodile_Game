/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain.theme;

import java.util.Random;

public enum Animal implements Theme {

    INSTANCE(),
    HIPPO("Бeгeмoта"),
    BARAN("Бapaна"),
    HEDGEHOG("Ежа"),
    HARE("3aйца"),
    COW("Kopoву"),
    FOX("Лиcицу"),
    FROG("Лягyшку"),
    BEAR("Meдвeдя"),
    DOG("Coбaку"),
    CAT("Кошку");

    @Override
    public String getNextWord() {
        return values[new Random().nextInt(1, values.length)].getWord();
    }

    public String getWord() {
        return word;
    }

    private static Animal[] values = Animal.values();
    private String word;

    Animal(String word) {
        this.word = word;
    }

    Animal() {

    }
}