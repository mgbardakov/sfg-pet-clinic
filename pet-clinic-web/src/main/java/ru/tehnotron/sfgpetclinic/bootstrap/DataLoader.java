package ru.tehnotron.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.tehnotron.sfgpetclinic.model.*;
import ru.tehnotron.sfgpetclinic.services.OwnerService;
import ru.tehnotron.sfgpetclinic.services.PetTypeService;
import ru.tehnotron.sfgpetclinic.services.SpecialityService;
import ru.tehnotron.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (petTypeService.findAll().size() == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCat = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Howard");
        owner1.setLastName("Lovecraft");
        owner1.setAddress("123 Sesame Street");
        owner1.setCity("Gotham");
        owner1.setTelephone("555-34-34");

        Pet howardsPet = new Pet();
        howardsPet.setPetType(savedCat);
        howardsPet.setOwner(owner1);
        howardsPet.setBirthday(LocalDate.now());
        howardsPet.setName("Nagger-Man");
        owner1.getPets().add(howardsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Gordon");
        owner2.setLastName("Freeman");
        owner2.setAddress("124 Elm Street");
        owner2.setCity("Silent Hill");
        owner2.setTelephone("555-11-32");

        Pet gordonsPet = new Pet();
        gordonsPet.setPetType(savedDog);
        gordonsPet.setOwner(owner2);
        gordonsPet.setBirthday(LocalDate.now());
        gordonsPet.setName("Boxer");
        owner2.getPets().add(gordonsPet);

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Harrison");
        vet1.setLastName("Ford");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Charles");
        vet2.setLastName("Chaplin");
        vet1.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
