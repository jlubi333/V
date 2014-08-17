package core.tile.textTile;

import core.tile.Tile;
import core.tile.TileDisplay;

import java.awt.*;

public class EnemyTile extends Tile {
    public EnemyTile() {
        super("Enemy", true, new TileDisplay('V', Color.RED, new Color(255, 0, 0, 100)));
    }
}
