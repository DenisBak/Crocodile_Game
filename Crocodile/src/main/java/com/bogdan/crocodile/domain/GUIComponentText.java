/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain;

public enum GUIComponentText {

    WELCOME("Добро пожаловать в \"Крокодил\"!"),
    SELECT_PLAYERS_COUNT("Введите количество игроков:"),
    SELECT_THEME("Выбирите тему: "),
    PLAY("Играть!"),
    DEFAULT_PLAYER_NAME("none"),
    YOU_SHOW("Тебе нужно показать:"),
    DEFAULT_OBJECT_TO_SHOW("none"),
    BAD("Не справился :("),
    GOOD("Справился :)"),
    RESULT("Результаты"),
    MENU("Меню");


    GUIComponentText(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private final String value;
}
