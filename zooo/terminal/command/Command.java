package zooo.terminal.command;

public class Command {
    public static final String CREATE = "Create";
    public static final String DELETE = "Delete";
    public static final String PRINTZOO = "PrintZoo";
    public static final String EXIT = "Exit";
    public static final String LION = "Lion";
    public static final String WOLF = "Wolf";
    public static final String SNAKE = "Snake";

    private final String commandString;
    private final String animalToAct;

    public Command(String commandString, String Animal) {
        this.commandString = commandString;
        this.animalToAct = Animal;
    }

    public boolean isCreate() {
        return commandString.equalsIgnoreCase(CREATE);
    }

    public boolean isDelete() {
        return commandString.equalsIgnoreCase(DELETE);
    }

    public boolean isLion() {
        return animalToAct.equalsIgnoreCase(LION);
    }

    public boolean isWolf() {
        return animalToAct.equalsIgnoreCase(WOLF);
    }

    public boolean isSnake() {
        return animalToAct.equalsIgnoreCase(SNAKE);
    }

    public boolean isPrintZoo() {
        return commandString.equalsIgnoreCase(PRINTZOO);
    }

    public boolean isExit() {
        return commandString.equalsIgnoreCase(EXIT);
    }

    public String getCommandString() {
        return commandString;
    }
}