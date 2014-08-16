package core.tile.textTile;

import core.tile.Tile;
import core.tile.TileDisplay;

import java.awt.*;

public class PlayerTile extends Tile {
    public PlayerTile() {
        super("Player", true, new TileDisplay('@', Color.CYAN, new Color(0, 0, 0, 0)));
    }
}
