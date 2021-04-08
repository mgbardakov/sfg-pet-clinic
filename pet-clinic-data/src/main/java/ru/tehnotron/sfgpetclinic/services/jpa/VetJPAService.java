package ru.tehnotron.sfgpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Vet;
import ru.tehnotron.sfgpetclinic.repository.VetRepository;
import ru.tehnotron.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetJPAService extends AbstractJPAService<Vet> implements VetService {

    public VetJPAService(VetRepository vetRepository) {
        super(vetRepository);
    }
}
