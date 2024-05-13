package com.stud.java.services.impl;

import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;
import com.stud.java.services.CatGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CatGeneratorImpl implements CatGenerator {

    public List<CatEntity> generate(int num) {
        ArrayList<CatEntity> cats = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            cats.add(create());
        }

        return cats;
    }

    private CatEntity create() {

        return new CatEntity(
                UUID.randomUUID(),
                "Cat",
                LocalDate.now(),
                generateBreed(),
                generateColor());
    }

    private Breed generateBreed() {
        Breed[] breeds = Breed.values();

        return breeds[new Random().nextInt(breeds.length)];
    }

    private Color generateColor() {
        Color[] colors = Color.values();

        return colors[new Random().nextInt(colors.length)];
    }
}
