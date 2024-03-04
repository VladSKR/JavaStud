package dao.impl;

import dao.OwnerDao;
import repository.entity.OwnerEntity;

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
