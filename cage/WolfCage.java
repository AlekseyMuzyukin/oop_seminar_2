package cage;

import animals.Wolf;
import comparators.WolfComparator;
import iterators.WolfIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {
    protected final ArrayList<Wolf> wolves;
    protected int clean;
    protected WolfIterator wolfIter;

    public WolfCage() {
        wolves = new ArrayList<>();
        wolfIter = new WolfIterator(wolves);
    }

    public void sortByWeightAndAge() {
        Collections.sort(wolves, new WolfComparator());
    }

    public void printCage() {
        for (Wolf el : wolves) {
            System.out.println(el);
        }
    }

    @Override
    public int animalAdd(Wolf wolfToAdd) {
        if (wolfToAdd instanceof Wolf) {
            wolves.add(wolfToAdd);
        } else {
            System.out.println("Not a wolf");
        }
        return wolves.size();
    }

    @Override
    public void ageSort() {
        Collections.sort(wolves, new WolfComparator());
    }

    @Override
    public void foodTransfer(int foodWeight) {
        for (Wolf el : wolves) {
            el.feed(foodWeight / wolves.size());
        }
        clean = foodWeight;
    }

    @Override
    public void cageClean() {
        System.out.println("Manure size in cage is: " + clean + " ... cleaning");
        clean = 0;
        System.out.println("Manure size in cage is: " + clean);
    }

    @Override
    public Wolf catchAnimal() {
        Random rand = new Random();
        int index = rand.nextInt(wolves.size());
        if (wolves.size() > 0) {
            return wolves.get(index);
        } else
            return null;
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "clean=" + clean +
                ", wolves=" + wolves.size() +
                '}';
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }
}