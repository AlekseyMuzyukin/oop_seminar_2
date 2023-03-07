package zooo.factory;

import zooo.animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionsFactory {

    private static final Random RAND = new Random();


    public static Lion createRandomLion() {
        return new Lion(RAND.nextInt(50), RAND.nextInt(50), 4, RAND.nextInt(20));
    }

    public static ArrayList<Lion> createLionCollection(int lionCount) {
        ArrayList<Lion> newLionCollection = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            newLionCollection.add(createRandomLion());
        }
        return newLionCollection;
    }
}
