package com.stud.java.dao.impl;


import com.stud.java.dao.OwnerDao;
import com.stud.java.repository.entity.OwnerEntity;

import java.util.UUID;

public class OwnerDaoImpl implements OwnerDao {

    private static OwnerEntity ownerEntity;

    @Override
    public OwnerEntity getById(UUID id) {

        return ownerEntity;
    }

    @Override
    public OwnerEntity save(OwnerEntity otherOwnerEntity) {

        ownerEntity = otherOwnerEntity;

        return otherOwnerEntity;
    }
}
