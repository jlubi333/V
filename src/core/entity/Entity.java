package core.entity;

import core.GameMap;
import core.Location;
import core.Updatable;
import core.battle.Battler;
import core.tile.Tile;
import util.Vector2;

public abstract class Entity implements Updatable {
    private String name;
    private GameMap map;
    private Location location;
    private Tile tile;
    private Battler battler;

    protected Entity(String name, GameMap map, Location location, Tile tile, Battler battler) {
        this.name = name;
        this.map = map;
        this.location = location;
        this.tile = tile;
        this.battler = battler;
    }

    public void update() {

    }

    public void move(Vector2 v) {
        this.location.x += v.x;
        this.location.y += v.y;
    }

    public void jumpTo(Location loc) {
        this.location = loc;
    }
}