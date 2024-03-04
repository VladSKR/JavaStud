package dao.impl;

import dao.CatDao;
import repository.entity.CatEntity;

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