package com.stud.java;

import com.stud.java.enums.Breed;
import com.stud.java.repository.entity.CatEntity;
import com.stud.java.repository.entity.CatEntityGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class JavaStudApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaStudApplication.class, args);

        List<CatEntity> cats = CatEntityGenerator.generateCats(100);
        Map<Breed, Integer> breedCount = CatEntity.countCatsByBreed(cats);
        System.out.println(breedCount);

        for (CatEntity cat : cats) {
            System.out.println(cat);
        }
    }
}
