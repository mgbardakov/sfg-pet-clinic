package ru.tehnotron.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

     T findBy(ID id);

     T save(T object);

     void delete(T object);

     void deleteById(ID id);
}
