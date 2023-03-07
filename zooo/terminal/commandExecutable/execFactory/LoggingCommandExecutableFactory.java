package zooo.terminal.commandExecutable.execFactory;

import zooo.terminal.command.Command;
import zooo.terminal.commandExecutable.CommandExecutable;
import zooo.zoo.Zoo;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl{

    @Override
    public CommandExecutable create(Command command, Zoo zoo){
        System.out.println("Команда: " + command.getCommandString());
        System.out.println("Объект: " + zoo.toString());
        CommandExecutable outExec = super.create(command, zoo);
        System.out.println("Экземпляр: " + outExec.toString());
        return outExec;
    }
}