package core.tile.textTile;

import core.tile.TextBasedTile;

import java.awt.*;

public class Floor extends TextBasedTile {
    public Floor() {
        super("Floor", false, ' ', new Color(0, 0, 0, 0), new Color(0, 0, 0));
    }
}