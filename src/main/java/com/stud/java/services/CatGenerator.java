package com.stud.java.services;

import com.stud.java.repository.entity.CatEntity;

import java.util.List;

public interface CatGenerator {

    List<CatEntity> generate(int num);
}
