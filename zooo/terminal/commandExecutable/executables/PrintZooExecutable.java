package zooo.terminal.commandExecutable.executables;

import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.zoo.Zoo;

public class PrintZooExecutable implements CommandExecutable {
    private final Zoo zoo;

    public PrintZooExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.printZoo();
    }
}