package com.stud.java.dao;

import com.stud.java.repository.entity.OwnerEntity;

import java.util.UUID;

public interface OwnerDao {

    OwnerEntity getById(UUID id);

    OwnerEntity save(OwnerEntity ownerEntity);
}
