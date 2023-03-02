package zoo_cell;

import java.util.ArrayList;
import java.util.Random;

import animals.Lion;
import cage.SnakeCage;
import cage.LionCage;
import cage.WolfCage;

public class Zoo {

    private ArrayList<WolfCage> wolfCages;
    private ArrayList<LionCage> lionCages;
    private ArrayList<SnakeCage> snakeTerrariums;

    public Zoo() {
        this.wolfCages = new ArrayList<>();
        this.lionCages = new ArrayList<>();
        this.snakeTerrariums = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "wolfCage=" + wolfCages +
                ", lionCage=" + lionCages +
                ", snakeTerrarium=" + snakeTerrariums +
                '}';
    }

    public void addLion(Lion lionToAdd) {
        int len = lionCages.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (lionCages != null) {
            LionCage randCage = lionCages.get(cageNumber);
            System.out.println("Добавляем льва");
            System.out.println(lionToAdd.toString());
            randCage.animalAdd(lionToAdd);
        } else {
            System.out.println("Lion cage list is empty");
        }
    }

    public void removeRandomLion() {
        int len = lionCages.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (lionCages != null) {
            LionCage randCage = lionCages.get(cageNumber);
            if (randCage != null) {
                randCage.deleteLion(randCage.catchAnimal());
            } else {
                System.out.println("Cage is empty");
            }
            ;
        } else {
            System.out.println("Lion cage list is empty");
        }
    }

    public void addLionCage(LionCage cageToAdd) {
        lionCages.add(cageToAdd);
    }

    public void addWolfCage(WolfCage cageToAdd) {
        wolfCages.add(cageToAdd);
    }

    public void addSnakeCage(SnakeCage cageToAdd) {
        snakeTerrariums.add(cageToAdd);
    }

    public ArrayList<WolfCage> getWolfCages() {
        return wolfCages;
    }

    public void setWolfCages(ArrayList<WolfCage> wolfCage) {
        this.wolfCages = wolfCage;
    }

    public ArrayList<LionCage> getLionCages() {
        return lionCages;
    }

    public void setLionCages(ArrayList<LionCage> lionCages) {
        this.lionCages = lionCages;
    }

    public ArrayList<SnakeCage> getSnakeTerrarium() {
        return snakeTerrariums;
    }

    public void setSnakeTerrariums(ArrayList<SnakeCage> snakeTerrarium) {
        this.snakeTerrariums = snakeTerrarium;
    }
}