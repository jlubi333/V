package core.entity;

import core.Direction;
import core.Location;
import core.battle.Battler;
import core.tile.Tile;

public class Player extends Entity {
    public Player(String name, Location location, Tile tile, Direction direction, Battler battler) {
        super(name, location, tile, direction, battler, false);
    }
}