package core.tile.textTile;

import core.tile.TextBasedTile;

import java.awt.*;

public class Wall extends TextBasedTile {
    public Wall() {
        super("Wall", true, '#', new Color(255, 255, 255), new Color(0, 0, 0));
    }
}