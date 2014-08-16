package core.tile.textTile;

import core.tile.Tile;
import core.tile.TileDisplay;

import java.awt.*;

public class FloorTile extends Tile {
    public FloorTile() {
        super("Floor", false, new TileDisplay('.', new Color(255, 255, 255, 50), new Color(0, 0, 0, 0)));
    }
}