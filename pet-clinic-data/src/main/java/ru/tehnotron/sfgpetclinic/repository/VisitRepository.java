package ru.tehnotron.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.tehnotron.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
