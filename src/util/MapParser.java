package util;

import core.tile.Tile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MapParser {
    public static  List<List<Tile>> parseFile(String filename) throws FileNotFoundException, ClassNotFoundException {
        List<List<Tile>> tiles = new ArrayList<>();

        File file = new File(filename);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            tiles.add(new ArrayList<>());
            String[] data = scan.nextLine().split(",");
            for (String className : data) {
                try {
                    @SuppressWarnings("unchecked")
                    Tile tile = (Tile) Class.forName("core.tile.textTile." + className + "Tile").newInstance();
                    tiles.get(tiles.size() - 1).add(tile);
                } catch (IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                }
                catch (ClassNotFoundException e) {
                    throw new ClassNotFoundException("Invalid data in file \"" + filename + "\": " + className);
                }
            }
        }

        return tiles;
    }
}
