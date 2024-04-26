package com.stud.java.repository.entity;
import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class CatEntityGenerator extends CatEntity {

    private static final String[] Names = {"Муся", "Томас", "Тоша", "Маруся", "Жека", "Красавчик", "Васаби", "Суши", "Стив", "Стелла", "Кирби", "Марио-Сан", "Тайбой", "Блейд", "Санбой"};
    private static Random Random = new Random();

    public static UUID generateId() {
        return UUID.randomUUID();
    }

    public static String generateName() {
        return Names[Random.nextInt(Names.length)];
    }

    public static LocalDate generateBirthDate() {
        LocalDate start = LocalDate.of(2000, 1, 1);
        LocalDate end = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(start, end);
        long randomDays = Random.nextLong(daysBetween);

        LocalDate randomDate = start.plusDays(randomDays);
        return randomDate;
    }

    public static Breed generateBreed() {
        Breed[] breeds = Breed.values();
        return breeds[Random.nextInt(breeds.length)];
    }

    public static Color generateColor() {
        Color[] colors = Color.values();
        return colors[Random.nextInt(colors.length)];
    }

    public static CatEntity generateCat() {
        UUID id = generateId();
        String name = generateName();
        LocalDate birthDate = generateBirthDate();
        Breed breed = generateBreed();
        Color color = generateColor();

        return new CatEntity(id, name, birthDate, breed, color);
    }

    public static List<CatEntity> generateCats(int count) {
        List<CatEntity> cats = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            cats.add(generateCat());
        }
        return cats;
    }
}

