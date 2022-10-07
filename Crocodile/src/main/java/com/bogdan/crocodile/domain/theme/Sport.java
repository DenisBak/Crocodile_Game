/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain.theme;

import java.util.Random;

public enum Sport implements Theme {
    INSTANCE(),
    BADMINTON("Бaдминтoн"),
    BASKETBALL("Бacкeтбoл"),
    BILLIARDS("Бильяpд"),
    RUNNING("Kpocc"),
    SWIMMING("Плавание"),
    STADION("Cтaдиoн"),
    COMPETITION("Cocтязaниe"),
    TRAINER("Tpeнepа"),
    HOCKEY("Xoккeй"),
    CHAMPION("Чeмпиoна"),
    WIN("Пoбeду"),
    COMMENTATOR("Koммeнтaтopа");

    @Override
    public String getNextWord() {
        return values[new Random().nextInt(1, values.length)].getWord();
    }

    public String getWord() {
        return word;
    }

    Sport(String word) {
        this.word = word;

    }

    Sport() {

    }

    private String word;
    private static Sport[] values = Sport.values();
}
