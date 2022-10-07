/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain.theme;

import java.util.Random;


public enum Stationer implements Theme {
    INSTANCE(),
    PEN("Ручку"),
    PENCIL("Карандаш"),
    BOOK("Книгу"),
    CAP("Колпачок"),
    ALIDAD("Транспортир"),
    INK("Чернила"),
    BLOT("Кляксу"),
    DIARY("Дневник"),
    CHALK("Мелок"),
    ERASER("Ластик"),
    PAPER("Бумагу"),
    FOLDER("Папку"),
    STAPLER("Степлер"),
    GLUE_STICK("Клей-карандаш")
    ;

    @Override
    public String getNextWord() {
        return values[new Random().nextInt(1, values.length)].getWord();
    }
    
    public String getWord() {
        return word;
    }
    
    private static Stationer[] values = Stationer.values();
    
    private String word;

    Stationer(String word) {
        this.word = word;
    }
    Stationer() {
        
    }
}
