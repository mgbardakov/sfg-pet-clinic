package ru.tehnotron.sfgpetclinic.services.map;

import ru.tehnotron.sfgpetclinic.model.Owner;
import ru.tehnotron.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return map.values().stream().filter(x -> x.getLastName()
                .equals(lastName)).findFirst().orElse(null);
    }
}
