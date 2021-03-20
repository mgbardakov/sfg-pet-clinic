package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Pet;
import ru.tehnotron.sfgpetclinic.services.PetService;

@Service
@Profile({"map", "default"})
public class PetServiceMap extends AbstractMapService<Pet> implements PetService {

}
