package com.stud.java.service.impl;

import com.stud.java.enums.Breed;
import com.stud.java.repository.entity.CatEntity;
import com.stud.java.service.CatService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatServiceImpl implements CatService {

    public Map<Breed, Integer> getAmountByBreed(List<CatEntity> cats) {
        Map<Breed, Integer> amountByBreed = new HashMap<>();

        for (CatEntity cat : cats) {
            Breed breed = cat.getBreed();
            amountByBreed.merge(breed, 1, Integer::sum);
        }

        return amountByBreed;
    }
}
