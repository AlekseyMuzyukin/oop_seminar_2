package zooo.terminal.commandExecutable.executables;

import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
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
        this.zoo.removeRandomLion();
    }
}