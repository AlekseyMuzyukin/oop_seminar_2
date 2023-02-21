package zoo;

import java.util.ArrayList;

import animals.Lion;
import cage.LionCage;
import factory.LionsFactory;

public class Task {

    public static void main(String[] args) {
        Lion firstLion = new Lion(10, 10, 10, 10);
        System.out.println(firstLion);
        firstLion.feed(100);
        System.out.println(firstLion.getWeight());
        ArrayList<Lion> newColl = LionsFactory.createLionCollection(50);
        System.out.println(newColl);
        LionCage newCage = new LionCage();
        for (Lion el : newColl) {
            newCage.animalAdd(el);
        }
        System.out.println(newCage);
        System.out.println(newCage.catchAnimal());
        newCage.foodTransfer(2_000);
        newCage.cageClean();
    }
}