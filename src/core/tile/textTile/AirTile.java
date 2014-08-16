package core.tile.textTile;

import core.tile.Tile;
import core.tile.TileDisplay;

import java.awt.*;

public class AirTile extends Tile {
    public AirTile() {
        super("Air", false, new TileDisplay(' ', new Color(0, 0, 0, 0), new Color(0, 0, 0, 0)));
    }
}