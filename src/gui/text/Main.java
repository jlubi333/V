package gui.text;

import util.GameInfo;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JPanel mainPanel = new JPanel();
        JPanel sidebar = new JPanel();
        JPanel game = new JPanel();

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

        game.setPreferredSize(new Dimension(500, 500));

        mainPanel.add(sidebar);
        mainPanel.add(game);

        JFrame frame = new JFrame(GameInfo.GAME_NAME);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
