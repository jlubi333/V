package util;

import core.tile.Tile;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MapParser {
    public static  List<List<Tile>> parseFile(InputStream inputStream) throws FileNotFoundException, ClassNotFoundException, URISyntaxException {
        List<List<Tile>> tiles = new ArrayList<>();

        Scanner scan = new Scanner(inputStream);
        String mapName = scan.nextLine();
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
                    // TODO
                    throw new ClassNotFoundException("Invalid data in map \"" + mapName + "\": " + className);
                }
            }
        }

        return tiles;
    }
}
