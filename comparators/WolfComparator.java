package comparators;

import animals.Wolf;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {

    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (Integer.compare(o1.getWeight(), o2.getWeight()) == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}