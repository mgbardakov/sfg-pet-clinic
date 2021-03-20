package ru.tehnotron.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.tehnotron.sfgpetclinic.model.Owner;
import ru.tehnotron.sfgpetclinic.model.Vet;
import ru.tehnotron.sfgpetclinic.services.OwnerService;
import ru.tehnotron.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Lovecraft");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Gordon");
        owner2.setLastName("Freeman");
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
