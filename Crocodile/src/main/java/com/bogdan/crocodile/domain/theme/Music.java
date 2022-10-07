/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain.theme;

import java.util.Random;

public enum Music implements Theme {
    INSTANCE(),
    VIOLIN("Скрипка"),
    GUITAR("Гитара"),
    DRUM("Барабан"),
    PIPE("Трубу"),
    THROMBONE("Tромбон"),
    CLARNET("Kларнет"),
    CELLO("Bиолончель"),
    ACCORDION("Баян"),
    MEDIATOR("Mедиатор"),
    MUSIC("Песню"),
    COUPLET("Kуплет");

    @Override
    public String getNextWord() {
        return values[new Random().nextInt(1, values.length)].getWord();
    }

    public String getWord() {
        return word;
    }

    private static Music[] values = Music.values();

    private String word;

    Music(String word) {
        this.word = word;
    }

    Music() {

    }
}
