package ru.tehnotron.sfgpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Speciality;
import ru.tehnotron.sfgpetclinic.repository.SpecialityRepository;
import ru.tehnotron.sfgpetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialityJPAService extends AbstractJPAService<Speciality> implements SpecialityService {
    public SpecialityJPAService(SpecialityRepository specialityRepository) {
        super(specialityRepository);
    }
}
