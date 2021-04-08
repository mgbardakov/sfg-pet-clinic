package ru.tehnotron.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.tehnotron.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
