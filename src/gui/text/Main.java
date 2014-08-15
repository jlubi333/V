package gui.text;

import core.GameMap;
import core.TextBasedTile;
import util.GameInfo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JPanel mainPanel = new JPanel();

        JPanel sidebar = new JPanel();
        sidebar.setLayout(new GridBagLayout());
        sidebar.setPreferredSize(new Dimension(300, 500));

        GridBagConstraints logConstraints = new GridBagConstraints();
        JTextArea log = new JTextArea();
        logConstraints.gridx = 0;
        logConstraints.gridy = 0;
        logConstraints.weightx = 1.0;
        logConstraints.weighty = 1.0;
        logConstraints.fill = GridBagConstraints.BOTH;
        sidebar.add(log, logConstraints);

        GridBagConstraints textInputConstraints = new GridBagConstraints();
        JTextField textInput = new JTextField();
        textInputConstraints.gridx = 0;
        textInputConstraints.gridy = 1;
        textInputConstraints.weightx = 1.0;
        textInputConstraints.fill = GridBagConstraints.HORIZONTAL;
        sidebar.add(textInput, textInputConstraints);

        mainPanel.add(sidebar);

        List<List<TextBasedTile>> tiles = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            tiles.add(new ArrayList<>());
            for(int j = 0; j < 10; j++) {
                tiles.get(i).add(new TextBasedTile("Floor", false, 'A', Color.RED));
            }
        }
        GameMap<TextBasedTile> map = new GameMap<>(tiles);
        Font f = new Font("Courier New", Font.PLAIN, 16);
        GameComponent gameComponent = new GameComponent(map, f);
        gameComponent.setPreferredSize(new Dimension(500, 500));


        mainPanel.add(gameComponent);

        JFrame frame = new JFrame(GameInfo.GAME_NAME);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}