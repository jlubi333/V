package core.entity;

import core.GameMap;
import core.Location;
import core.battle.Move;
import core.tile.Tile;

import java.util.List;

public abstract class Entity {
    private String name;
    private GameMap map;
    private Location location;
    private Tile tile;
    private List<Move> moves;

    protected Entity(String name, GameMap map, Location location, Tile tile, List<Move> moves) {
        this.name = name;
        this.map = map;
        this.location = location;
        this.tile = tile;
        this.moves = moves;
    }
}