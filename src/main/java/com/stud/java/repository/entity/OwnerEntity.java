package com.stud.java.repository.entity;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class OwnerEntity extends BaseEntity {

    public OwnerEntity() {
    }

    public OwnerEntity(UUID id, String name, LocalDate birthDate) {

        super(id, name, birthDate);
    }

    public UUID getId() {

        return super.getId();
    }

    public void setId(UUID id) {

        super.setId(id);
    }

    public String getName() {

        return super.getName();
    }

    public void setName(String name) {

        super.setName(name);
    }

    public LocalDate getBirthDate() {

        return super.getBirthDate();
    }

    public void setBirthDate(LocalDate birthDate) {

        super.setBirthDate(birthDate);
    }

    @Override
    public String toString() {

        return super.getClass().getSimpleName()
                + "(id = " + super.getId()
                + ", name = " + super.getName()
                + ", birthdate = " + super.getBirthDate() + ")";
    }

    @Override
    public int hashCode() {

        try {
            return this.getName().length()
                    + this.getBirthDate().lengthOfMonth()
                    + this.getId().hashCode();
        }
        catch (NullPointerException e) {
            return 0;
        }

    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof OwnerEntity)) {

            return false;
        }

        if (this == object) {

            return true;
        }

        OwnerEntity otherOwner = (OwnerEntity) object;

        return Objects.equals(this.getId(), otherOwner.getId())
                && Objects.equals(this.getName(), otherOwner.getName())
                && Objects.equals(this.getBirthDate(), otherOwner.getBirthDate());
    }
}
