package com.stud.java.service.impl;

import com.stud.java.enums.Breed;
import com.stud.java.repository.entity.CatEntity;
import com.stud.java.service.CatService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatServiceImpl implements CatService {

    @Override
    public Map<Breed, Integer> amountOfCatsByBreed(List<CatEntity> catEntities) {

        Map<Breed, Integer> result = new HashMap<>();

        for (CatEntity cat : catEntities) {
            Breed breed = cat.getBreed();
            result.merge(breed, 1, Integer::sum);
        }

        return result;
    }
}
