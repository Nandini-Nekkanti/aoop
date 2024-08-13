package macro.command;

public class SaveCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Executing Save Command...");
    }
}
