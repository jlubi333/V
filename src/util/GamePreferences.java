package util;

import core.Direction;

import java.awt.event.KeyEvent;
import java.util.EnumMap;

public abstract class GamePreferences {
    public static final int INSPECT_KEY = KeyEvent.VK_SPACE;

    private static final EnumMap<Direction, Integer> movementKeys;

    static {
        movementKeys = new EnumMap<Direction, Integer>(Direction.class);
        movementKeys.put(Direction.UP, KeyEvent.VK_W);
        movementKeys.put(Direction.RIGHT, KeyEvent.VK_D);
        movementKeys.put(Direction.DOWN, KeyEvent.VK_S);
        movementKeys.put(Direction.LEFT, KeyEvent.VK_A);
    }

    public static int getMovementKey(Direction d) {
        return movementKeys.get(d);
    }
}
