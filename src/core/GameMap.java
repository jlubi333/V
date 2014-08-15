package core;

import java.util.List;

public class GameMap<T extends Tile> {
    private List<List<T>> tiles;

    public GameMap(List<List<T>> tiles) {
        this.tiles = tiles;
    }

    public int getRows() {
        return this.tiles.size();
    }

    public int getCols() {
        if(this.tiles.size() == 0) {
            return 0;
        }
        return this.tiles.get(0).size();
    }

    public T getTile(int row, int col) {
        if(!isInsideMap(row, col)) {
            return null;
        }
        return this.tiles.get(row).get(col);
    }

    public void setTile(int row, int col, T tile) {
        if(!isInsideMap(row, col)) {
            return;
        }
        this.tiles.get(row).set(col, tile);
    }

    public boolean isInsideMap(int row, int col) {
        return row >= 0 && row < this.getRows() && col >= 0 && col < this.getCols();
    }
}