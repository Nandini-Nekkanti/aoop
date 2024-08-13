package macro.tests;

import org.junit.Before;
import org.junit.Test;
import macro.command.OpenCommand;
import macro.command.SaveCommand;
import macro.recorder.MacroRecorder;

public class MacroRecorderTest {

    private MacroRecorder macroRecorder;

    @Before
    public void setUp() {
        macroRecorder = new MacroRecorder();
    }

    @Test
    public void testRecordAndPlay() {
        // Record commands
        macroRecorder.record(new OpenCommand());
        macroRecorder.record(new SaveCommand());

        // Play the recorded commands
        macroRecorder.play();
    }
}
