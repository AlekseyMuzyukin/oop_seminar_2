package factory;

import animals.Lion;
import java.util.ArrayList;
import java.util.Random;

public class LionsFactory {

    private static Random rand = new Random();

    public static ArrayList<Lion> createLionCollection(int lionCount) {
        ArrayList<Lion> newLionCollection = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            newLionCollection.add(new Lion(rand.nextInt(50), rand.nextInt(50), 4, rand.nextInt(20)));
        }
        return newLionCollection;
    }
}