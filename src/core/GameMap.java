package core;

import core.entity.Entity;
import core.tile.Tile;

import java.util.List;

public class GameMap<T extends Tile> implements Updatable {
    private List<List<T>> tiles;
    private List<Entity> entities;

    public GameMap(List<List<T>> tiles, List<Entity> entities) {
        this.tiles = tiles;
        this.entities = entities;
    }

    public void update() {
        for (Entity e : this.getEntities()) {
            e.update();
        }
    }

    public List<Entity> getEntities() {
        return this.entities;
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

    public T getTile(int row, int col) {
        if (!isInsideMap(row, col)) {
            return null;
        }
        return this.tiles.get(row).get(col);
    }

    public void setTile(int row, int col, T tile) {
        if (!isInsideMap(row, col)) {
            return;
        }
        this.tiles.get(row).set(col, tile);
    }

    public boolean isInsideMap(int row, int col) {
        return row >= 0 && row < this.getRows() && col >= 0 && col < this.getCols();
    }
}