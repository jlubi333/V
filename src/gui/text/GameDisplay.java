package gui.text;

import core.GameMap;

import javax.swing.*;

// Should extend JPanel
// Have a paintComponent method that updates based off of map
// It should update and read from map
public class GameDisplay {
    private JPanel gamePanel;
    private GameMap map;

    public GameDisplay(JPanel gamePanel, GameMap map) {
        this.gamePanel = gamePanel;
        this.map = map;
    }
}
