package zoo_cell;

import java.util.ArrayList;

import cage.SnakeCage;
import cage.LionCage;
import cage.WolfCage;

public class Zoo {
    private ArrayList<WolfCage> wolfCages;
    private ArrayList<LionCage> lionCages;
    private ArrayList<SnakeCage> snakeTerrariums;

    public Zoo() {
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "wolfCage=" + wolfCages +
                ", lionCage=" + lionCages +
                ", snakeTerrarium=" + snakeTerrariums +
                '}';
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
