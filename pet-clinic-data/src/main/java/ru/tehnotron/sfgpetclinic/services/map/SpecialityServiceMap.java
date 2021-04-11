package ru.tehnotron.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.tehnotron.sfgpetclinic.model.Speciality;
import ru.tehnotron.sfgpetclinic.services.SpecialityService;

@Service
@Profile({"map", "default"})
public class SpecialityServiceMap extends AbstractMapService<Speciality> implements SpecialityService {

}
