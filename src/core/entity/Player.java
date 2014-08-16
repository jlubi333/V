package core.entity;

import core.Location;
import core.battle.Battler;
import core.tile.Tile;

public class Player extends Entity {
    public Player(String name, Location location, Tile tile, Battler battler) {
        super(name, location, tile, battler);
    }
}