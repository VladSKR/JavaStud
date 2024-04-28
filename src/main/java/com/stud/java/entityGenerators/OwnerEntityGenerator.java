package com.stud.java.entityGenerators;

import com.stud.java.repository.entity.BaseEntity;
import com.stud.java.repository.entity.OwnerEntity;

import java.time.LocalDate;
import java.util.UUID;

import static java.lang.Math.abs;

public class OwnerEntityGenerator extends BaseEntityGenerator{
    @Override
    protected BaseEntity createEntity() {
        StringBuilder name = new StringBuilder();
        name.append("TestName - ").append(abs(random.nextInt()));
        UUID id = generateRandomId();
        LocalDate birthDate = generateRandomDate();
        return new OwnerEntity(id, name.toString(), birthDate);
    }
}
