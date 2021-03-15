package ru.tehnotron.sfgpetclinic.services;

import ru.tehnotron.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
