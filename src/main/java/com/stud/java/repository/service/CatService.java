package com.stud.java.repository.service;

import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;

import java.util.List;
import java.util.Map;

public interface CatService {

     Map<Breed, Integer> getAmountByBreed(List<CatEntity> cats);

    void changeColorInList(List<CatEntity> cats, Color newColor);
}
