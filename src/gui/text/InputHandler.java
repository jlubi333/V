package gui.text;

import util.GamePreferences;
import util.KeyManager;

public class InputHandler {
    private static boolean moved = false;

    public static void handle() {
        if (KeyManager.popKey(GamePreferences.UP_KEY)) {

        } else if (KeyManager.popKey(GamePreferences.RIGHT_KEY)) {

        } else if (KeyManager.popKey(GamePreferences.DOWN_KEY)) {

        } else if (KeyManager.popKey(GamePreferences.LEFT_KEY)) {

        }
    }
}
