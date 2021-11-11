package com.company;

import java.time.LocalDate;

public class Animal {
    private String name;
    private double weight;
    private LocalDate birthDate;

    public Animal(String name, double weight, LocalDate birthDate) {
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    public void eating(int a) {
        weight += a;
    }

    public void shitting(int a) {
        weight -= a;
    }

    public void print() {
        System.out.println("None");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
