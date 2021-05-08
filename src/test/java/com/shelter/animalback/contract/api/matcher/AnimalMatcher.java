package com.shelter.animalback.contract.api.matcher;

import com.shelter.animalback.domain.Animal;
import org.mockito.ArgumentMatcher;

public class AnimalMatcher implements ArgumentMatcher<Animal> {

    private Animal animal;

    public AnimalMatcher(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean matches(Animal argument) {

        return animal.getBreed().equals(argument.getBreed()) &&
                animal.getGender().equals(argument.getGender()) &&
                animal.getName().equals(argument.getName()) &&
                animal.isVaccinated() == argument.isVaccinated();
    }
}
