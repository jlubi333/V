package core;

import core.entity.Entity;
import core.entity.Player;
import core.tile.Tile;

import java.util.List;

public class GameMap implements Updatable {
    private List<List<Tile>> tiles;
    private Player player;
    private List<Entity> entities;

    public GameMap(List<List<Tile>> tiles, Player player, List<Entity> entities) {
        this.tiles = tiles;
        this.player = player;
        this.entities = entities;
        this.entities.add(this.player);

        for(Entity e : this.entities) {
            e.setMap(this);
        }
    }

    public void update() {
        for (Entity e : this.getEntities()) {
            e.update();
        }
    }

    public List<Entity> getEntities() {
        return this.entities;
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getRows() {
        return this.tiles.size();
    }

    public int getCols() {
        if (this.tiles.size() == 0) {
            return 0;
        }
        return this.tiles.get(0).size();
    }

    public Tile getTile(Location loc) {
        if (!isInsideMap(loc)) {
            return null;
        }
        return this.tiles.get(loc.row).get(loc.col);
    }

    public void setTile(Location loc, Tile tile) {
        if (!isInsideMap(loc)) {
            return;
        }
        this.tiles.get(loc.row).set(loc.col, tile);
    }

    public boolean isInsideMap(Location loc) {
        return loc.row >= 0 && loc.row < this.getRows() && loc.col >= 0 && loc.col < this.getCols();
    }
}