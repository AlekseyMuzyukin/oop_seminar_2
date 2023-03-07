package zooo.animals.comparators;


import zooo.animals.Wolf;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {

    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getWeight() == o2.getWeight()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}