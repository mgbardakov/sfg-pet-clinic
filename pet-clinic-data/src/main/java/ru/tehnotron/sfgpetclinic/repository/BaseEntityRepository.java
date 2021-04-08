package ru.tehnotron.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.tehnotron.sfgpetclinic.model.BaseEntity;

public interface BaseEntityRepository<T extends BaseEntity<Long>> extends CrudRepository<T, Long> {
}
