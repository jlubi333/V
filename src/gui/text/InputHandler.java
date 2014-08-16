package gui.text;

import core.GameMap;
import core.Location;
import core.action.MoveAction;
import util.GamePreferences;

import javax.swing.*;

public class InputHandler {

    public static void handle(JComponent c, GameMap map) {
        InputMap inputMap = c.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = c.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.UP_KEY, 0), "up");
        actionMap.put("up", new MoveAction(c, map.getPlayer(), new Location(-1, 0)));

        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.RIGHT_KEY, 0), "right");
        actionMap.put("right", new MoveAction(c, map.getPlayer(), new Location(0, 1)));

        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.DOWN_KEY, 0), "down");
        actionMap.put("down", new MoveAction(c, map.getPlayer(), new Location(1, 0)));

        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.LEFT_KEY, 0), "left");
        actionMap.put("left", new MoveAction(c, map.getPlayer(), new Location(0, -1)));
    }
}