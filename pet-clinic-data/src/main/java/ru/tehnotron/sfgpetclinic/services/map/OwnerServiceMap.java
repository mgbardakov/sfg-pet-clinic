package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Owner;
import ru.tehnotron.sfgpetclinic.services.OwnerService;

@Service
@Profile({"map", "default"})
public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return map.values().stream().filter(x -> x.getLastName()
                .equals(lastName)).findFirst().orElse(null);
    }
}
