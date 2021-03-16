package ru.tehnotron.sfgpetclinic.services.map;

import ru.tehnotron.sfgpetclinic.model.BaseEntity;
import ru.tehnotron.sfgpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity<ID>, ID> implements CrudService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findBy(ID id) {
        return map.get(id);
    }

    @Override
    public T save(T object) {
        return map.put(object.getId(), object);
    }

    @Override
    public void delete(T object) {
        map.remove(object.getId());
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }
}
