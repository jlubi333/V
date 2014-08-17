package core.entity;

import core.Direction;
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
    private Direction direction;
    private Battler battler;
    private boolean isHostile;

    protected Entity(String name, Location location, Tile tile, Direction direction, Battler battler, boolean isHostile) {
        this.name = name;
        this.location = location;
        this.tile = tile;
        this.direction = direction;
        this.battler = battler;
        this.isHostile = isHostile;
    }

    public void update() {

    }

    public void onInspect(Entity sender) {
        System.out.println(this.name);
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

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Battler getBattler() {
        return this.battler;
    }

    public void setBattler(Battler battler) {
        this.battler = battler;
    }

    public boolean isHostile() {
        return this.isHostile;
    }

    public void move(Direction d) {
        this.location = this.location.plus(Direction.getDisplacementLocation(d));
    }

    public void jumpTo(Location loc) {
        this.location = loc;
    }

    public void inspect() {
        this.inspect(this.getDirection());
    }

    public void inspect(Direction d) {
        Location locToInspect = this.getLocation().plus(Direction.getDisplacementLocation(d));
        Entity e = this.getMap().getEntityAtLocation(locToInspect);
        if(e != null) {
            e.onInspect(this);
        }
    }
}