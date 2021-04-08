package ru.tehnotron.sfgpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Owner;
import ru.tehnotron.sfgpetclinic.repository.OwnerRepository;
import ru.tehnotron.sfgpetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerJPAService extends AbstractJPAService<Owner> implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerJPAService(OwnerRepository ownerRepository) {
        super(ownerRepository);
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName)
                .orElseThrow(() -> new RuntimeException("No owner with this last name"));
    }
}
