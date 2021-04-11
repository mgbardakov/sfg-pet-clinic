package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Visit;
import ru.tehnotron.sfgpetclinic.services.VisitService;

@Service
@Profile({"map", "default"})
public class VisitServiceMap extends AbstractMapService<Visit> implements VisitService {
    @Override
    public Visit save(Visit object) {
        if (object.getPet() == null ||
            object.getPet().getId() == null ||
            object.getPet().getOwner() == null ||
            object.getPet().getOwner().getId() == null) {
            throw new RuntimeException("invalid visit state");
        }
        return super.save(object);
    }
}
