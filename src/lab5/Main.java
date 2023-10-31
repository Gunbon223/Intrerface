package lab5;

import lab5.entities.Pet;
import lab5.service.PetService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> petArrayList = new ArrayList<>();
        PetService service = new PetService(petArrayList);
        service.run();
        service.match();

    }
}
