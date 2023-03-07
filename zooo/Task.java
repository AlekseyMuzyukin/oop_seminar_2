package zooo;

import zooo.terminal.TerminalReader;
import zooo.terminal.commandExecutable.execFactory.LoggingCommandExecutableFactory;
import zooo.terminal.commandParser.CommandParser;
import zooo.terminal.commandParser.ZooCommandParser;
import zooo.zoo.Zoo;

public class Task {

    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        newZoo.populateZoo(50, 50, 50);
        CommandParser newCom = new ZooCommandParser();
        TerminalReader newTerm = TerminalReader.create(newCom, new LoggingCommandExecutableFactory());
        newTerm.setZoo(newZoo);
        newTerm.loopScan();
    }
}
