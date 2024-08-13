package macro.main;

import macro.command.OpenCommand;
import macro.command.SaveCommand;
import macro.recorder.MacroRecorder;

public class MacroApp {

    public static void main(String[] args) {
        MacroRecorder macroRecorder = new MacroRecorder();

        // Record some actions
        macroRecorder.record(new OpenCommand());
        macroRecorder.record(new SaveCommand());

        // Play back the recorded actions
        macroRecorder.play();
    }
}