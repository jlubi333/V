//package util;
//
//import core.Location;
//import core.battle.Battler;
//import core.entity.Entity;
//import core.tile.Tile;
//
//import java.io.InputStream;
//import java.lang.reflect.InvocationTargetException;
//import java.util.Scanner;
//
////EntityType
////String:name
////Location:row,col
////Tile:TileClassName
////Battler:BattlerClassName
//public abstract class EntityParser {
//    public static Entity parseFile(InputStream inputStream) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Scanner scan = new Scanner(inputStream);
//        String entityTypeString = scan.nextLine();
//        String nameString = scan.nextLine();
//        String locationString = scan.nextLine();
//        String tileClassString = scan.nextLine();
//        String battlerClassString = scan.nextLine();
//
//
//
//        String[] locationStringArray = locationString.split(",");
//        int row = Integer.parseInt(locationStringArray[0]);
//        int col = Integer.parseInt(locationStringArray[1]);
//        Location loc = new Location(row, col);
//
//        Tile tile = null;
//        try {
//            tile = (Tile) Class.forName("core.tile.textTile." + tileClassString + "Tile").newInstance();
//        } catch (InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            throw new ClassNotFoundException("Invalid tile data in Entity \"" + nameString + "\": " + tileClassString);
//        }
//
//        Battler battler = null;
//        try {
//            battler = (Battler) Class.forName("core.battler." + battlerClassString).newInstance();
//        } catch (InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            throw new ClassNotFoundException("Invalid battler data in Entity \"" + nameString + "\": " + battlerClassString);
//        }
//
//
//
//        Entity e = (Entity) Class.forName(entityTypeString).getConstructors()[0].newInstance();
//
//
//
//
//
//
//        return tiles;
//    }
//    }
//}
