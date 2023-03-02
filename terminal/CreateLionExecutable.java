package terminal;

import animals.Lion;
import cage.LionCage;
import factory.LionsFactory;
import zoo_cell.Zoo;

public class CreateLionExecutable implements CommandExecutable {
    private Zoo zoo;
    private LionCage cage;
    private Lion lion;

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public CreateLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public CreateLionExecutable(Zoo zoo, LionCage lionCage, Lion lion) {
        this.zoo = zoo;
        this.cage = lionCage;
        this.lion = lion;
    }

    @Override
    public void execute() {
        this.zoo.addLion(LionsFactory.createRandomLion());
    }
}