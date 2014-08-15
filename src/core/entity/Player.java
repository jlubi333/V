package core.entity;

import core.GameMap;
import core.Location;
import core.battle.Battler;
import core.tile.Tile;

public class Player extends Entity {
    public Player(String name, GameMap map, Location location, Tile tile, Battler battler) {
        super(name, map, location, tile, battler);
    }
}
