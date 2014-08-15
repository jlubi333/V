package gui.text;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Gui gui = new Gui("Courier New", "map.jplm");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}