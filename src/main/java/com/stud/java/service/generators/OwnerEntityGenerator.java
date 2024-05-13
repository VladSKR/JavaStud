package com.stud.java.service.generators;

import com.stud.java.repository.entity.OwnerEntity;

public class OwnerEntityGenerator extends EntityGenerator<OwnerEntity> {

    @Override
    protected OwnerEntity createEntity() {
        OwnerEntity ownerEntity = new OwnerEntity();
        initBaseFields(ownerEntity);
        return ownerEntity;
    }
}
