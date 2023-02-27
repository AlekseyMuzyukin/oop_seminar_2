package zoo;

import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolfFactory;
import zoo_cell.Zoo;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

    public static void main(String[] args) {
        ArrayList<Lion> newColl = LionsFactory.createLionCollection(10);
        System.out.println(newColl);
        LionCage newCage = new LionCage();
        for (Lion el : newColl) {
            newCage.animalAdd(el);
        }
        System.out.println(newCage);
        System.out.println(newCage.catchAnimal());
        newCage.foodTransfer(500);
        newCage.cageClean();
        newCage.ageSort();
        newCage.printCage();
        System.out.println("-------Sorting lions by mane---------");
        newCage.maneSort();
        newCage.printCage();
        WolfCage secCage = new WolfCage();
        ArrayList<Wolf> secColl = WolfFactory.createWolfCollection(10);
        for (Wolf el : secColl) {
            secCage.animalAdd(el);
        }
        secCage.printCage();
        System.out.println("-------Sorting wolves by weight and age ---------");
        secCage.sortByWeightAndAge();
        secCage.printCage();
        System.out.println("---------Iterating through wolf list------------");
        Iterator<Wolf> firstIter = secCage.iterator();
        while (firstIter.hasNext()) {
            Wolf nextWolf = firstIter.next();
            System.out.println(nextWolf);
        }
        System.out.println("Hello there");
        Iterator<Wolf> newIter = secCage.iterator();
        while (newIter.hasNext()) {
            Wolf nextWolf = newIter.next();
            System.out.println(nextWolf);
        }
        Zoo newZoo = new Zoo();
        System.out.println(newZoo);
    }
}