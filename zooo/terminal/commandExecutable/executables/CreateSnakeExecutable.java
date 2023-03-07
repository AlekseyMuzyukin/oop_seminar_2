package zooo.terminal.commandExecutable.executables;

import zooo.factory.SnakeFactory;
import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateSnakeExecutable(Zoo zoo) {
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
        this.zoo.addSnake(SnakeFactory.createRandomSnake());
    }
}