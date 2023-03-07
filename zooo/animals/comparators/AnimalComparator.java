package zooo.animals.comparators;

import zooo.animals.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}