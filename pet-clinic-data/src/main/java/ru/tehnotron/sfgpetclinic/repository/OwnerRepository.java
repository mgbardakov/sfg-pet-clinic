package ru.tehnotron.sfgpetclinic.repository;

import ru.tehnotron.sfgpetclinic.model.Owner;

import java.util.Optional;

public interface OwnerRepository extends BaseEntityRepository<Owner> {

    Optional<Owner> findByLastName(String lastName);
}
