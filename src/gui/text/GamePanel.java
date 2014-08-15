package gui.text;

import core.GameMap;
import core.TextBasedTile;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private GameMap<TextBasedTile> map;
    private Font font;
    int charWidth, charHeight;

    /**
     * @param map  The GameMap to draw
     * @param font Should be monospaced
     */
    public GamePanel(GameMap<TextBasedTile> map, Font font) {
        this.map = map;
        this.font = font;

        FontMetrics fm = this.getFontMetrics(font);
        this.charWidth = fm.charWidth(' ');
        this.charHeight = fm.getHeight();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(this.font);
        this.setBackground(Color.ORANGE);
        for (int i = 0; i < this.map.getRows(); i++) {
            for (int j = 0; j < this.map.getCols(); j++) {
                g.drawString("" + this.map.getTile(i, j).getRepresentation(),
                        (i + 1) * this.charWidth,
                        (j + 1) * this.charHeight);
            }
        }
    }
}