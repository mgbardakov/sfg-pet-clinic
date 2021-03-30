package ru.tehnotron.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.tehnotron.sfgpetclinic.model.Owner;
import ru.tehnotron.sfgpetclinic.model.PetType;
import ru.tehnotron.sfgpetclinic.model.Vet;
import ru.tehnotron.sfgpetclinic.services.OwnerService;
import ru.tehnotron.sfgpetclinic.services.PetTypeService;
import ru.tehnotron.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Lovecraft");
        owner1.setAddress("123 Sesame Street");
        owner1.setCity("Gotham");
        owner1.setTelephone("555-34-34");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Gordon");
        owner2.setLastName("Freeman");
        owner2.setAddress("124 Elm Street");
        owner2.setCity("Silent Hill");
        owner2.setTelephone("555-11-32");
        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Harrison");
        vet1.setLastName("Ford");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Charles");
        vet2.setLastName("Chaplin");
        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
