/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain.theme;

import java.util.Random;

public enum Profession implements Theme {
    INSTANCE(),
    BUTCHER("Мяснка"),
    CARPENTER("Плотника"),
    CLEANER("Уборщика"),
    ENGINEER("Инженера"),
    JOURNALIST("Журналиста"),
    NURSE("Медсестру"),
    PHOTOGRAPHER("Фотографа"),
    SCIENTIST("Ученого"),
    TAILOR("Портниху"),
    TRANSLATOR("Переводчика"),
    ACCOUNTANT("Бухгалтера"),
    BRICKLAYER("Каменщика"),
    DESIGNER("Дизайнера");

    @Override
    public String getNextWord() {
        return values[new Random().nextInt(1, values.length)].getWord();
    }

    public String getWord() {
        return word;
    }

    private static Profession[] values = Profession.values();

    private String word;

    Profession(String word) {
        this.word = word;
    }

    Profession() {

    }
}
