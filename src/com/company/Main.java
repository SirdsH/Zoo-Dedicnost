package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pes pes = new Pes("Doggo", 20, LocalDate.of(2018,12,12), true);
        Kocka kocka = new Kocka("Kocka", 8, LocalDate.of(2019,3,24), 7);
        Kachna kachna = new Kachna("Kachna", 1.8, LocalDate.of(2020,1,2));

        System.out.println(pes.getBirthDate());
        System.out.println(kocka.getLivesCount());
        kocka.fallDown();
        System.out.println(kocka.getLivesCount());
        kocka.isDead();
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(pes);
        animal.add(kocka);
        animal.add(kachna);
        for (int i = 0; i < animal.size(); i++) {
            animal.get(i).print();
        }

    }
}
