package com.stud.java.service;

import com.stud.java.enums.Breed;
import com.stud.java.repository.entity.CatEntity;

import java.util.List;
import java.util.Map;

public interface CatService {

    Map<Breed, Integer> amountOfCatsByBreed(List<CatEntity> catEntities);
}
