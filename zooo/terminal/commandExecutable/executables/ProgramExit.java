package zooo.terminal.commandExecutable.executables;

import zooo.terminal.commandExecutable.CommandExecutable;

public class ProgramExit implements CommandExecutable {
    @Override
    public void execute() {
        System.out.println("Goodbye");
        System.exit(0);
    }
}