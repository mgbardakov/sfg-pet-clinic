package ru.tehnotron.sfgpetclinic.services.map;

import ru.tehnotron.sfgpetclinic.model.BaseEntity;
import ru.tehnotron.sfgpetclinic.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity<Long>> implements CrudService<T, Long> {

    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findBy(Long id) {
        return map.get(id);
    }

    @Override
    public T save(T object) {
        if (object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object can not be null");
        }
        return object;
    }

    @Override
    public void delete(T object) {
        map.remove(object.getId());
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }

    private Long getNextId() {
        var rsl = 1L;
        var keys = map.keySet();
        if (!keys.isEmpty()) {
            rsl = Collections.max(map.keySet()) + 1;
        }
        return rsl;
    }
}
