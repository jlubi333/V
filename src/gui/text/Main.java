package gui.text;

import core.GameMap;
import core.tile.TextBasedTile;
import util.MapParser;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Font f = new Font("Courier New", Font.PLAIN, 16);
            List<List<TextBasedTile>> tiles = MapParser.parseFile("map.jplm");
            GameMap<TextBasedTile> map = new GameMap<>(tiles, new ArrayList<>());
            Gui gui = new Gui(f, map);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}