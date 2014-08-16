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

    public Tile getTile(int row, int col) {
        if (!isInsideMap(row, col)) {
            return null;
        }
        return this.tiles.get(row).get(col);
    }

    public void setTile(int row, int col, Tile tile) {
        if (!isInsideMap(row, col)) {
            return;
        }
        this.tiles.get(row).set(col, tile);
    }

    public boolean isInsideMap(int row, int col) {
        return row >= 0 && row < this.getRows() && col >= 0 && col < this.getCols();
    }
}