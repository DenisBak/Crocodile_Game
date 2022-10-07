/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bogdan.crocodile.domain;

public class Player {
    private static final int MAX_SCORE = 1;
    private static final int MIN_SCORE = -1;

    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        if (score < MAX_SCORE) this.score++;
    }

    public void decrementScore() {
        if (score > MIN_SCORE) this.score--;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", score=" + score + '}';
    }

    public String getStringRepres() {
        return name;
    }

    public String getStringRepresWithScore() {
        return name + " заработал: " + score + " очко";
    }
}
