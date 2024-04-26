package com.stud.java.service.generator;

import com.stud.java.enums.Breed;
import com.stud.java.repository.entity.CatEntity;
import com.stud.java.service.impl.CatService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatServiceImpl implements CatService {

    @Override
    public Map<Breed, Integer> countCatsByBreed(List<CatEntity> cats) {
        Map<Breed, Integer> breedCount = new HashMap<>();

        for (CatEntity cat : cats) {
            Breed breed = cat.getBreed();
            Integer count = breedCount.get(breed);
            if (count == null) {
                count = 0;
            }
            breedCount.put(breed, count + 1);
            if (breedCount.containsKey(breed)) {
                breedCount.put(breed, breedCount.get(breed) + 1);
            } else {
                breedCount.put(breed, 1);
            }
        }

        return breedCount;
    }
}
