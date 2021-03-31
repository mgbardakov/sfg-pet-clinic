package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Vet;
import ru.tehnotron.sfgpetclinic.services.SpecialityService;
import ru.tehnotron.sfgpetclinic.services.VetService;

@Service
@Profile({"map", "default"})
public class VetServiceMap extends AbstractMapService<Vet> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object) {
        object.getSpecialities().forEach(specialityService::save);
        return super.save(object);
    }
}
