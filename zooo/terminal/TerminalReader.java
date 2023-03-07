package zooo.terminal;

import zooo.terminal.command.Command;
import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.terminal.commandExecutable.execFactory.CommandExecutableFactory;
import zooo.terminal.commandParser.CommandParser;
import zooo.terminal.menu.Menu;
import zooo.zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static final Scanner iScanner = new Scanner(System.in);
    private static TerminalReader singleton;
    private final CommandParser commandParser;
    private final CommandExecutableFactory execFactory;
    private Zoo zoo;

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory execFactory) {
        this.commandParser = commandParser;
        this.execFactory = execFactory;
    }

    public static TerminalReader create(CommandParser commandParser, CommandExecutableFactory execFactory) {
        if (singleton == null) {
            return new TerminalReader(commandParser, execFactory);
        }
        return singleton;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public String loopScan() {
        String commandString;
        Command newCom = new Command("", "");
        while (true) {
            Menu.printMenu();
            commandString = iScanner.nextLine();
            newCom = this.commandParser.parseCommand(commandString);
            CommandExecutable newImpl = this.execFactory.create(newCom, this.zoo);
            newImpl.execute();
        }
    }
}