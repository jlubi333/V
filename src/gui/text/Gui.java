package gui.text;

import core.GameMap;
import util.GameInfo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.FileNotFoundException;

public class Gui {
    private GamePanel gamePanel;

    public Gui(Font font, GameMap map) throws FileNotFoundException, ClassNotFoundException {
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

        this.gamePanel = new GamePanel(font, map);
        this.gamePanel.setPreferredSize(new Dimension(500, 500));

        mainPanel.add(this.gamePanel);

        JFrame frame = new JFrame(GameInfo.GAME_NAME);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public GamePanel getGamePanel() {
        return this.gamePanel;
    }
}