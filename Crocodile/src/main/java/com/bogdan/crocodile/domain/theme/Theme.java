/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain.theme;

public interface Theme {
            String SPORT_NAME = "Спорт",
            ANIMAL_NAME = "Животные",
            STATIONER_NAME = "Канцтовары",
            PROFESSION_NAME = "Профессии",
            MUSIC_NAME = "Музыка",
            FOOD_NAME = "Еда";

    String getNextWord();

    static Theme getThemeByName(String name) {
        if (name.equals(SPORT_NAME)) {
            return Sport.INSTANCE;
        } else if (name.equals(ANIMAL_NAME)) {
            return Animal.INSTANCE;
        } else if (name.equals(STATIONER_NAME)) {
            return Stationer.INSTANCE;
        } else if (name.equals(PROFESSION_NAME)) {
            return Profession.INSTANCE;
        } else if (name.equals(MUSIC_NAME)) {
            return Music.INSTANCE;
        } else if (name.equals(FOOD_NAME)) {
            return Food.INSTANCE;
        }
        throw new NullPointerException();
    }
}
