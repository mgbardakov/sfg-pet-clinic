package ru.tehnotron.sfgpetclinic.services.jpa;

import ru.tehnotron.sfgpetclinic.model.BaseEntity;
import ru.tehnotron.sfgpetclinic.repository.BaseEntityRepository;
import ru.tehnotron.sfgpetclinic.services.CrudService;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractJPAService<T extends BaseEntity<Long>> implements CrudService<T, Long> {

    private final BaseEntityRepository<T> baseEntityRepository;

    public AbstractJPAService(BaseEntityRepository<T> baseEntityRepository) {
        this.baseEntityRepository = baseEntityRepository;
    }

    @Override
    public Set<T> findAll() {
        var rslSet = new HashSet<T>();
        baseEntityRepository.findAll().forEach(rslSet::add);
        return rslSet;
    }

    @Override
    public T findBy(Long aLong) {
        return baseEntityRepository.findById(aLong)
                .orElseThrow(() -> new RuntimeException("No entity with such id"));
    }

    @Override
    public T save(T object) {
        return baseEntityRepository.save(object);
    }

    @Override
    public void delete(T object) {
        baseEntityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        baseEntityRepository.deleteById(aLong);
    }
}
