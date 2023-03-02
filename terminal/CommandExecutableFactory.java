package terminal;

import zoo_cell.Zoo;

public class CommandExecutableFactory {
    public static CommandExecutable create(String input, Zoo zoo) {
        if (input.equals("DeleteLion")) {
            return new DeleteLionExecutable(zoo);
        } else if (input.equals("CreateLion")) {
            return new CreateLionExecutable(zoo);
        } else
            return null;
    }
}