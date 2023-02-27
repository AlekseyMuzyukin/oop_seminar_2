package cage;

import animals.Animal;

public interface AnimalCage<T extends Animal> {
    int animalAdd(T animalToAdd);

    void ageSort();

    void foodTransfer(int foodWeight);

    void cageClean();

    T catchAnimal();
}