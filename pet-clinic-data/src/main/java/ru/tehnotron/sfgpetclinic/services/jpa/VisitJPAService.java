package ru.tehnotron.sfgpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Visit;
import ru.tehnotron.sfgpetclinic.repository.VisitRepository;
import ru.tehnotron.sfgpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitJPAService extends AbstractJPAService<Visit> implements VisitService {
    public VisitJPAService(VisitRepository visitRepository) {
        super(visitRepository);
    }
}
