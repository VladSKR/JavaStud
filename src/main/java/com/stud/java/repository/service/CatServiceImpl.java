package com.stud.java.repository.service;

import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatServiceImpl implements CatService {

    public Map<Breed, Integer> getAmountByBreed(List<CatEntity> cats) {
        Map<Breed, Integer> amountByBreed = new HashMap<>();

        for (CatEntity cat : cats) {
            Breed breed = cat.getBreed();
            amountByBreed.put(breed, amountByBreed.get(breed) + 1);
        }

        return amountByBreed;
    }

    public void changeColorInList(List<CatEntity> cats, Color newColor) {

        for (CatEntity cat : cats) {
            cat.setColor(newColor);
        }
    }
}
