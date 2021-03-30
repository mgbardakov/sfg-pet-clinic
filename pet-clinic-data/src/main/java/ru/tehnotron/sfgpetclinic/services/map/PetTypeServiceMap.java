package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.PetType;
import ru.tehnotron.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType> implements PetTypeService {
}
