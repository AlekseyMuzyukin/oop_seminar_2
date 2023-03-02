package zoo;

import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolfFactory;
import zoo_cell.Zoo;

import java.util.ArrayList;
import terminal.CommandParser;
import terminal.TerminalReader;

public class Task {

    public static void main(String[] args) {
        ArrayList<Lion> newColl = LionsFactory.createLionCollection(10);
        System.out.println(newColl);
        LionCage newCage = new LionCage();
        for (Lion el : newColl) {
            newCage.animalAdd(el);
        }
        WolfCage secCage = new WolfCage();
        ArrayList<Wolf> secColl = WolfFactory.createWolfCollection(10);
        for (Wolf el : secColl) {
            secCage.animalAdd(el);
        }

        Zoo newZoo = new Zoo();
        newZoo.addLionCage(newCage);
        newZoo.addWolfCage(secCage);
        System.out.println(newZoo);
        TerminalReader newTerm = TerminalReader.create(new CommandParser() {
            @Override
            public String[] parseCommand(String inputCommand) {
                return new String[0];
            }
        });
        newTerm.setZoo(newZoo);
        newTerm.loopScan();
    }
}