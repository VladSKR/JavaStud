package com.stud.java.entityGenerators;

import com.stud.java.repository.entity.BaseEntity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public abstract class BaseEntityGenerator {
    protected static final Random random = new Random();

    public List<BaseEntity> generateEntities(int n){
        List<BaseEntity> listOfEntities = new ArrayList<>(n);
        for (int i = 0; i < n; i ++) {
            BaseEntity entity = createEntity();
            listOfEntities.add(entity);
        }
        return listOfEntities;
    }

    protected LocalDate generateRandomDate() {
        LocalDate start = LocalDate.of(1990, 1, 1);
        LocalDate end = LocalDate.of(2020, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        long randomDays = ThreadLocalRandom.current().nextLong(daysBetween + 1);
        return start.plusDays(randomDays);
    }

    protected UUID generateRandomId() {
        return UUID.randomUUID();
    }
    protected abstract BaseEntity createEntity();
}
