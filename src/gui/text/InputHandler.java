package gui.text;

import core.Direction;
import core.GameMap;
import core.action.InspectAction;
import core.action.MoveAction;
import util.GamePreferences;

import javax.swing.*;

public class InputHandler {

    public static void handle(JComponent c, GameMap map) {
        InputMap inputMap = c.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = c.getActionMap();

        for(Direction d : Direction.values()) {
            inputMap.put(KeyStroke.getKeyStroke(GamePreferences.getMovementKey(d), 0), d);
            actionMap.put(d, new MoveAction(c, map.getPlayer(), d));
        }

        final String INSPECT = "inspect";
        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.INSPECT_KEY, 0), INSPECT);
        actionMap.put(INSPECT, new InspectAction(c, map.getPlayer()));

//        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.UP_KEY, 0), "up");
//        actionMap.put("up", new MoveAction(c, map.getPlayer(), new Location(-1, 0)));
//
//        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.RIGHT_KEY, 0), "right");
//        actionMap.put("right", new MoveAction(c, map.getPlayer(), new Location(0, 1)));
//
//        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.DOWN_KEY, 0), "down");
//        actionMap.put("down", new MoveAction(c, map.getPlayer(), new Location(1, 0)));
//
//        inputMap.put(KeyStroke.getKeyStroke(GamePreferences.LEFT_KEY, 0), "left");
//        actionMap.put("left", new MoveAction(c, map.getPlayer(), new Location(0, -1)));
    }
}