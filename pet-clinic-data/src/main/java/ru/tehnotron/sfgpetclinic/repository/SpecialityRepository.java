package ru.tehnotron.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.tehnotron.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
