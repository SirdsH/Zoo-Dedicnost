package com.company;

import java.time.LocalDate;

public class Kocka extends Animal {
    private int livesCount;

    public Kocka(String name, double weight, LocalDate birthDate, int livesCount) {
        super(name, weight, birthDate);
        this.livesCount = livesCount;
    }

    public void fallDown() {
        livesCount -= 1;
    }

    public int getLivesCount() {
        return livesCount;
    }

    @Override
    public void print() {
        System.out.println("Mňau");
    }
}
