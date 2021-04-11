package ru.tehnotron.sfgpetclinic.services.jpa;

import org.springframework.data.repository.CrudRepository;
import ru.tehnotron.sfgpetclinic.model.BaseEntity;
import ru.tehnotron.sfgpetclinic.services.CrudService;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractJPAService<T extends BaseEntity<Long>> implements CrudService<T, Long> {

    private final CrudRepository<T, Long> crudRepository;

    public AbstractJPAService(CrudRepository<T, Long> crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public Set<T> findAll() {
        var rslSet = new HashSet<T>();
        crudRepository.findAll().forEach(rslSet::add);
        return rslSet;
    }

    @Override
    public T findBy(Long aLong) {
        return crudRepository.findById(aLong)
                .orElseThrow(() -> new RuntimeException("No entity with such id"));
    }

    @Override
    public T save(T object) {
        return crudRepository.save(object);
    }

    @Override
    public void delete(T object) {
        crudRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        crudRepository.deleteById(aLong);
    }
}
