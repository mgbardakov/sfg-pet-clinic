package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Pet;
import ru.tehnotron.sfgpetclinic.services.PetService;
import ru.tehnotron.sfgpetclinic.services.PetTypeService;

@Service
@Profile({"map", "default"})
public class PetServiceMap extends AbstractMapService<Pet> implements PetService {

    private final PetTypeService petTypeService;

    public PetServiceMap(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public Pet save(Pet object) {
        petTypeService.save(object.getPetType());
        return super.save(object);
    }
}
