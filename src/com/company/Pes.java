package com.company;

import java.time.LocalDate;

public class Pes extends Animal {
    private boolean collar;

    public Pes(String name, double weight, LocalDate birthDate, boolean collar) {
        super(name, weight, birthDate);
        this.collar = collar;
    }

    public boolean isCollar() {
        return collar;
    }

    @Override
    public void print() {
        System.out.println("Haf");
    }
}
