package zooo.terminal.commandExecutable.executables;

import zooo.factory.LionsFactory;
import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo) {
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
        this.zoo.addLion(LionsFactory.createRandomLion());
    }
}