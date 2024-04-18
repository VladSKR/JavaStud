package com.stud.java.repository.entity;

import java.time.LocalDate;
import java.util.UUID;

public abstract class BaseEntity {

    private UUID id;
    private String name;
    private LocalDate birthDate;

    public BaseEntity() {
    }

    public BaseEntity(UUID id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
