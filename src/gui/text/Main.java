package gui.text;

import core.GameMap;
import core.Location;
import core.entity.Player;
import core.tile.Tile;
import core.tile.textTile.PlayerTile;
import util.GameResources;
import util.MapParser;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Font f = new Font("Courier New", Font.PLAIN, 16);
            List<List<Tile>> tiles = MapParser.parseFile(GameResources.getPathToResource("map.jplm"));
            Player player = new Player("JPL", new Location(1, 1), new PlayerTile(), null);
            GameMap map = new GameMap(tiles, player, new ArrayList<>());
            Gui gui = new Gui(f, map);
            InputHandler.handle(gui.getGamePanel(), map);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}