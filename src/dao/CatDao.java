package dao;

import repository.entity.CatEntity;

import java.util.UUID;

public interface CatDao {

    CatEntity getById(UUID id);

    CatEntity save(CatEntity catEntity);
}
