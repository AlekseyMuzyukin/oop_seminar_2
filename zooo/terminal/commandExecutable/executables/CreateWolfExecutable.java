package zooo.terminal.commandExecutable.executables;

import zooo.factory.WolfFactory;
import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.addWolf(WolfFactory.createRandomWolf());
    }
}