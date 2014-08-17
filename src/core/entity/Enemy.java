package core.entity;

import core.Direction;
import core.Location;
import core.battle.Battler;
import core.tile.Tile;

public class Enemy extends Entity {
    public Enemy(String name, Location location, Tile tile, Direction direction, Battler battler) {
        super(name, location, tile, direction, battler, true);
    }
}