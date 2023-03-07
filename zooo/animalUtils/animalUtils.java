package zooo.animalUtils;

import zooo.animals.Animal;
import zooo.animals.comparators.AnimalComparator;

import java.util.Collections;
import java.util.List;

public class animalUtils {
    public static <T extends Animal> void sortAnimal(List<T> animalList) {
        Collections.sort(animalList, new AnimalComparator());
    }
}