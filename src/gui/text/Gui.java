package gui.text;

import core.GameMap;
import core.entity.Entity;
import core.tile.TextBasedTile;
import util.GameInfo;
import util.MapParser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Gui {
    public Gui(String level, String fontName) throws FileNotFoundException, ClassNotFoundException {
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLACK);

        JPanel sidebar = new JPanel();
        sidebar.setLayout(new GridBagLayout());
        sidebar.setPreferredSize(new Dimension(300, 500));

        GridBagConstraints logConstraints = new GridBagConstraints();
        JTextArea log = new JTextArea();
        log.setEditable(false);
        log.setBackground(new Color(255, 255, 255, 100));
        log.setBorder(new EmptyBorder(10, 10, 10, 10));
        log.setText("Welcome to " + GameInfo.GAME_NAME + ".");
        logConstraints.gridx = 0;
        logConstraints.gridy = 0;
        logConstraints.weightx = 1.0;
        logConstraints.weighty = 1.0;
        logConstraints.fill = GridBagConstraints.BOTH;
        sidebar.add(log, logConstraints);

        GridBagConstraints textInputConstraints = new GridBagConstraints();
        JTextField textInput = new JTextField();
        textInput.setBackground(new Color(255, 255, 255, 100));
        textInputConstraints.gridx = 0;
        textInputConstraints.gridy = 1;
        textInputConstraints.weightx = 1.0;
        textInputConstraints.fill = GridBagConstraints.HORIZONTAL;
        sidebar.add(textInput, textInputConstraints);

        mainPanel.add(sidebar);

        List<List<TextBasedTile>> tiles = MapParser.parseFile(level);
        GameMap<TextBasedTile> map = new GameMap<>(tiles, new ArrayList<Entity>());
        Font f = new Font(fontName, Font.PLAIN, 16);
        GamePanel gamePanel = new GamePanel(map, f);
        gamePanel.setPreferredSize(new Dimension(500, 500));

        mainPanel.add(gamePanel);

        JFrame frame = new JFrame(GameInfo.GAME_NAME);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}