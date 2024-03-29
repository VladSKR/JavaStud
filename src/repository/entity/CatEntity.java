package repository.entity;

import enums.Breed;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class CatEntity extends BaseEntity {

    private Breed breed;
    private String color;

    public CatEntity() {

    }

    public CatEntity(UUID id, String name, LocalDate birthDate, Breed breed, String color) {

        super(id, name, birthDate);
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {

        return this.breed.name();
    }

    public void setBreed(Breed breed) {

        this.breed = breed;
    }

    public String getColor() {

        return this.color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {

        return super.getClass().getSimpleName()
                + "(id = " + super.getId()
                + ", name = " + super.getName()
                + ", birthDate = " + super.getBirthDate()
                + ", breed = " + this.breed
                + ", color = " + this.color + ")";
    }

    @Override
    public int hashCode() {

        return breed.name().length() + color.length();
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CatEntity)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        CatEntity otherCat = (CatEntity) object;

        return Objects.equals(super.getId(), otherCat.getId())
                && Objects.equals(super.getName(), otherCat.getName())
                && Objects.equals(super.getBirthDate(), otherCat.getBirthDate())
                && Objects.equals(this.breed, otherCat.breed)
                && Objects.equals(this.color, otherCat.color);
    }
}
