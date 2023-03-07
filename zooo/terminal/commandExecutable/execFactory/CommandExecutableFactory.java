package zooo.terminal.commandExecutable.execFactory;

import zooo.terminal.command.Command;
import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.zoo.Zoo;

public interface CommandExecutableFactory {
    public CommandExecutable create(Command command, Zoo zoo);
}