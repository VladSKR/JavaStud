package com.stud.java.entityGenerators;

import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;
import com.stud.java.repository.entity.BaseEntity;
import com.stud.java.repository.entity.CatEntity;

import java.time.LocalDate;
import java.util.UUID;

import static java.lang.Math.abs;

public class CatEntityGenerator extends BaseEntityGenerator{
    @Override
    protected BaseEntity createEntity() {
        Breed[] breeds = Breed.values();
        Color[] colors = Color.values();
        StringBuilder name = new StringBuilder();
        name.append("TestName - ").append(abs(random.nextInt()));
        UUID id = generateRandomId();
        Breed breed = breeds[random.nextInt(breeds.length)];
        Color color = colors[random.nextInt(colors.length)];
        LocalDate birthDate = generateRandomDate();
        return new CatEntity(id, name.toString(), birthDate, breed, color);
    }
}
