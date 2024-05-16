package com.stud.java.service.generator;

import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;
import com.stud.java.service.impl.CatService;

import java.util.List;

public class CatServiceImpl implements CatService {

    @Override
    public void changeColor(List<CatEntity> cats, Color newColor) {

        for (CatEntity cat : cats) {
            cat.setColor(newColor);
        }
    }
}

