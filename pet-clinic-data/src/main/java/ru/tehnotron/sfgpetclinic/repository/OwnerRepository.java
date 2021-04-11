package ru.tehnotron.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.tehnotron.sfgpetclinic.model.Owner;

import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Optional<Owner> findByLastName(String lastName);
}
