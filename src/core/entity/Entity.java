package core.entity;

import core.GameMap;
import core.Location;
import core.Updatable;
import core.battle.Battler;
import core.tile.Tile;

public abstract class Entity implements Updatable {
    private String name;
    private GameMap map;
    private Location location;
    private Tile tile;
    private Battler battler;

    protected Entity(String name, Location location, Tile tile, Battler battler) {
        this.name = name;
        this.location = location;
        this.tile = tile;
        this.battler = battler;
    }

    public void update() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameMap getMap() {
        return this.map;
    }

    public void setMap(GameMap map) {
        this.map = map;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Tile getTile() {
        return this.tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public Battler getBattler() {
        return this.battler;
    }

    public void setBattler(Battler battler) {
        this.battler = battler;
    }

    public void move(Location displacement) {
        this.location = this.location.plus(displacement);
    }

    public void jumpTo(Location loc) {
        this.location = loc;
    }
}