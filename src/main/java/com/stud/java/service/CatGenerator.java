package com.stud.java.service;

import com.stud.java.repository.entity.CatEntity;

import java.util.List;

public interface CatGenerator {

    List<CatEntity> generateCats(int count);
}
