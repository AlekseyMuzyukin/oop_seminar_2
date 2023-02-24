package cage;

import animals.Animal;

public interface AnimalCage {

    int animalAdd(Animal animalToAdd);

    void foodTransfer(int foodWeight);

    void cageClean();

    Animal catchAnimal();
}