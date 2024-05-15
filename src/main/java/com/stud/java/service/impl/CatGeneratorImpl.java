package com.stud.java.service.impl;

import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;
import com.stud.java.service.CatGenerator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Random;

public class CatGeneratorImpl implements CatGenerator {

    private static final List<String> NAMES = List.of("Муся", "Томас", "Тоша", "Маруся", "Жека", "Красавчик", "Васаби", "Суши", "Стив", "Стелла", "Кирби", "Марио-Сан", "Тайбой", "Блейд", "Санбой");

    private static Random random = new Random();

    @Override
    public List<CatEntity> generateCats(int count) {

        List<CatEntity> cats = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            cats.add(generateCat());
        }
        return cats;
    }

    private CatEntity generateCat() {

        UUID id = UUID.randomUUID();
        String name = generateName();
        LocalDate birthDate = generateBirthDate();
        Breed breed = generateBreed();
        Color color = generateColor();

        return new CatEntity(id, name, birthDate, breed, color);
    }

    private String generateName() {

        return NAMES.get(random.nextInt(NAMES.size()));
    }

    private LocalDate generateBirthDate() {

        LocalDate start = LocalDate.of(2000, 1, 1);
        LocalDate end = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(start, end);
        long randomDays = random.nextLong(daysBetween);

        LocalDate randomDate = start.plusDays(randomDays);

        return randomDate;
    }

    private Breed generateBreed() {

        Breed[] breeds = Breed.values();

        return breeds[random.nextInt(breeds.length)];
    }

    private Color generateColor() {

        Color[] colors = Color.values();

        return colors[random.nextInt(colors.length)];
    }
}
