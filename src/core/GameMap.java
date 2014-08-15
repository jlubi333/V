package core;

import java.util.ArrayList;

public class GameMap {
    private ArrayList<ArrayList<Tile>> tiles;

    public GameMap(ArrayList<ArrayList<Tile>> tiles) {
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
}