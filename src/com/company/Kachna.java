package com.company;

import java.time.LocalDate;

public class Kachna extends Animal {

    public Kachna(String name, double weight, LocalDate birthDate) {
        super(name, weight, birthDate);
    }

    public void canFly() {
        if (getWeight() >= 1.6) {
            System.out.println("Can fly");
        } else System.out.println("Too fat");
    }

    @Override
    public void print() {
        System.out.println("Kachna");
    }
}
