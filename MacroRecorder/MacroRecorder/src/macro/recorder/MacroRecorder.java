package macro.recorder;

import java.util.ArrayList;
import java.util.List;
import macro.command.Command;

public class MacroRecorder {

    private List<Command> commands;

    public MacroRecorder() {
        commands = new ArrayList<>();
    }

    public void record(Command command) {
        commands.add(command);
    }

    public void play() {
        for (Command command : commands) {
            command.execute();
        }
    }
}