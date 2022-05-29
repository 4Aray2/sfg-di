package com.springframework.pets;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        if ("cat".equals(petType)) {
            return new CatPetService();
        }
        return new DogPetService();
    }
}
