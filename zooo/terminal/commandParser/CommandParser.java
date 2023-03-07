package zooo.terminal.commandParser;

import zooo.terminal.command.Command;

public interface CommandParser {

    Command parseCommand(String inputCommand);
}