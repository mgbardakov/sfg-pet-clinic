package ru.tehnotron.sfgpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Pet;
import ru.tehnotron.sfgpetclinic.repository.PetRepository;
import ru.tehnotron.sfgpetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetJPAService extends AbstractJPAService<Pet> implements PetService {
    public PetJPAService(PetRepository petRepository) {
        super(petRepository);
    }
}
