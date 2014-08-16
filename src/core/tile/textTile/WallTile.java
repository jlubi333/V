package core.tile.textTile;

import core.tile.Tile;
import core.tile.TileDisplay;

import java.awt.*;

public class WallTile extends Tile {
    public WallTile() {
        super("Wall", true, new TileDisplay('#', new Color(255, 255, 255), new Color(0, 0, 0)));
    }
}