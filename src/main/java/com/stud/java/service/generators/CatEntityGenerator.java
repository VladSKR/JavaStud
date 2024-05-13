package com.stud.java.service.generators;

import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;

public class CatEntityGenerator extends EntityGenerator<CatEntity> {

    @Override
    protected CatEntity createEntity() {
        Breed[] breeds = Breed.values();
        Color[] colors = Color.values();
        Breed breed = breeds[random.nextInt(breeds.length)];
        Color color = colors[random.nextInt(colors.length)];
        CatEntity catEntity = new CatEntity();
        initBaseFields(catEntity);
        catEntity.setBreed(breed);
        catEntity.setColor(color);
        return catEntity;
    }
}
