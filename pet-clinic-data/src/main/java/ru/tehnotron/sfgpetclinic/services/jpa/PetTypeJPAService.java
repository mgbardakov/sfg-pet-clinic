package ru.tehnotron.sfgpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.PetType;
import ru.tehnotron.sfgpetclinic.repository.PetTypeRepository;
import ru.tehnotron.sfgpetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeJPAService extends AbstractJPAService<PetType> implements PetTypeService {

    public PetTypeJPAService(PetTypeRepository petTypeRepository) {
        super(petTypeRepository);
    }
}
