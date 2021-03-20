package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Vet;
import ru.tehnotron.sfgpetclinic.services.VetService;

@Service
@Profile({"map", "default"})
public class VetServiceMap extends AbstractMapService<Vet> implements VetService {
}
