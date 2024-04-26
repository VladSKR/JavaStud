package com.stud.java.service.impl;

import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;

import java.util.List;

public interface CatService {
    void changeColor(List<CatEntity> cats, Color newColor);
}
