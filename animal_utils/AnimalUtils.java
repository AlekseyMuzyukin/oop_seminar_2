package animal_utils;

import java.util.Collections;
import java.util.List;

import animals.Animal;
import comparators.AnimalComparator;

public class AnimalUtils {
    public static <T extends Animal> void sortAnimal(List<T> animalList) {
        Collections.sort(animalList, new AnimalComparator());
    }
}
