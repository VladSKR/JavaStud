package com.stud.java.service.generators;

import com.stud.java.repository.entity.BaseEntity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.abs;

public abstract class EntityGenerator<T extends BaseEntity> {
    protected static final Random random = new Random();

    public List<T> generateEntities(int n){
        List<T> listOfEntities = new ArrayList<>(n);
        for (int i = 0; i < n; i ++) {
            listOfEntities.add(createEntity());
        }
        return listOfEntities;
    }

    protected LocalDate generateRandomDate() {
        LocalDate start = LocalDate.of(1990, 1, 1);
        LocalDate end = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        long randomDays = ThreadLocalRandom.current().nextLong(daysBetween + 1);
        return start.plusDays(randomDays);
    }

    protected String generateTestName() {
        StringBuilder name = new StringBuilder();
        name.append("TestName - ").append(abs(random.nextInt()));
        return name.toString();
    }

    protected void initBaseFields(T entity){
        entity.setId(UUID.randomUUID());
        entity.setName(generateTestName());
        entity.setBirthDate(generateRandomDate());
    }
    protected abstract T createEntity();
}
