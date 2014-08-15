package core;

import java.util.ArrayList;

public abstract class Entity {
    private String name;
    private GameMap map;
    private Location location;
    private Tile tile;
    private ArrayList<Move> moves;

    protected Entity(String name, GameMap map, Location location, Tile tile, ArrayList<Move> moves) {
        this.name = name;
        this.map = map;
        this.location = location;
        this.tile = tile;
        this.moves = moves;
    }
}