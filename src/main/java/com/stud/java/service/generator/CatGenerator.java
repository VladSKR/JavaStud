package com.stud.java.service.generator;
import com.stud.java.enums.Breed;
import com.stud.java.enums.Color;
import com.stud.java.repository.entity.CatEntity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Random;


public class CatGenerator extends CatEntity {

    private static final List<String> NAMES = List.of("Муся", "Томас", "Тоша", "Маруся", "Жека", "Красавчик", "Васаби", "Суши", "Стив", "Стелла", "Кирби", "Марио-Сан", "Тайбой", "Блейд", "Санбой");
    private static Random Random = new Random();

    public static UUID generateId() {
        return UUID.randomUUID();
    }

    public static String generateName() {
        return NAMES.get(Random.nextInt(NAMES.size()));
    }

    public static LocalDate generateBirthDate() {
        LocalDate start = LocalDate.of(2000, 1, 1);
        LocalDate end = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(start, end);
        long randomDays = Random.nextLong(daysBetween);

        LocalDate randomDate = start.plusDays(randomDays);
        return randomDate;
    }

    private static Breed generateBreed() {
        Breed[] breeds = Breed.values();
        return breeds[Random.nextInt(breeds.length)];
    }

    private static Color generateColor() {
        Color[] colors = Color.values();
        return colors[Random.nextInt(colors.length)];
    }

    private static CatEntity generateCat() {
        UUID id = generateId();
        String name = generateName();
        LocalDate birthDate = generateBirthDate();
        Breed breed = generateBreed();
        Color color = generateColor();

        return new CatEntity(id, name, birthDate, breed, color);
    }

    public static List<CatEntity> generateCats(int count) {
        List<CatEntity> cats = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            CatEntity cat = new CatEntity();
            cats.add(cat);
        }
        return cats;
    }
}

