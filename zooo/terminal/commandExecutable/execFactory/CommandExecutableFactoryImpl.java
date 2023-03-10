package zooo.terminal.commandExecutable.execFactory;

import zooo.terminal.command.Command;
import zooo.terminal.commandExecutable.*;
import zooo.terminal.commandExecutable.executables.*;
import zooo.zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    public static CommandExecutable emptyExecutable = new CommandExecutable() {
        @Override
        public void execute() {
            System.out.println("Command not found. Try again");
        }
    };
    public CommandExecutable create(Command command, Zoo zoo){
        if(command.isCreate()){
            if (command.isLion()) return new CreateLionExecutable(zoo);
            else if (command.isWolf()) return new CreateWolfExecutable(zoo);
            else if (command.isSnake()) return new CreateSnakeExecutable(zoo);
            else return emptyExecutable;
        }
        else if (command.isDelete()){
            if (command.isLion()) return new DeleteLionExecutable(zoo);
            else if (command.isWolf()) return new DeleteWolfExecutable(zoo);
            else if (command.isSnake()) return new DeleteSnakeExecutable(zoo);
            else return emptyExecutable;
        } else if (command.isPrintZoo()) {
            return new PrintZooExecutable(zoo);
        } else if (command.isExit()) {
            return new ProgramExit();
        } else return emptyExecutable;
    }
}