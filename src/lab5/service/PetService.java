package lab5.service;

import BaiTap1_2810.service.Utiliti;
import lab5.entities.Pet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetService {
    Utiliti utiliti = new Utiliti();
    ArrayList<Pet> petArrayList;
    Scanner scan = new Scanner(System.in);

    public PetService(ArrayList<Pet> petArrayList) {
        this.petArrayList = petArrayList;
    }

    public Pet inputPet() {
        Pet pet = new Pet();
        System.out.println("Nhap ten pet: ");
        pet.setName(utiliti.inputString(scan));
        System.out.println("Nhap type cho pet: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        int enumChoice = utiliti.inputInt(scan);
        switch (enumChoice) {
            case 1:
                pet.setPetType(Pet.TYPE.DOG);
            case 2:
                pet.setPetType(Pet.TYPE.CAT);
        }
        System.out.println("Nhap giong pet: ");
        pet.setSpecies(utiliti.inputString(scan));
        System.out.println("Nhap tuoi: ");
        pet.setAge(utiliti.inputInt(scan));
        System.out.println("Nhap mo ta: ");
        pet.setDescription(utiliti.inputString(scan));
        System.out.println("Nhap anh: ");
        pet.setImages(utiliti.inputString(scan));
        System.out.println("Nhap gioi tinh: ");
        pet.setSex(utiliti.inputString(scan));
        return pet;
    }

    public void run() {
        String choice;
        do {
            petArrayList.add(inputPet());
            System.out.println("Tiep tuc nhap pet? y/n: ");
            choice = utiliti.inputString(scan);
        }while (choice.equalsIgnoreCase("y"));
    }
    public void match() {
        Random random = new Random();
        System.out.println("Nhap pet cua ban de thuc hien match: ");
        Pet yourPet = inputPet();
        while (true) {
            int randomIndex = random.nextInt(petArrayList.size());
            Pet petMatch = petArrayList.get(randomIndex);
            if (petMatch.getPetType()==yourPet.getPetType() && !petMatch.getSex().equalsIgnoreCase(yourPet.getSex())) {
                System.out.println("Match success: ");
                System.out.println(yourPet);
                System.out.println("Match with: ");
                System.out.println(petMatch);
                break;
            }
            else {
                System.out.println("Chua tim thay!");
                System.out.println("Tiep tuc tim ? y/n");
                String choice = utiliti.inputString(scan);
                if (!choice.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }
    }
}


