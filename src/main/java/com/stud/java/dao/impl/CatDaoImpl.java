package com.stud.java.dao.impl;

import com.stud.java.dao.CatDao;
import com.stud.java.repository.entity.CatEntity;

import java.util.UUID;

public class CatDaoImpl implements CatDao {
    
    private static CatEntity catEntity;

    @Override
    public CatEntity getById(UUID id) {

        return catEntity;
    }

    @Override
    public CatEntity save(CatEntity otherCatEntity) {

        catEntity = otherCatEntity;

        return otherCatEntity;
    }
}
