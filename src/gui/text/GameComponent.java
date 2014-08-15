package gui.text;

import core.GameMap;
import core.TextBasedTile;

import javax.swing.*;
import java.awt.*;

public class GameComponent extends JComponent {
    private GameMap<TextBasedTile> map;
    private Font font;
    int charWidth, charHeight;

    /**
     * @param map The GameMap to draw
     * @param font Should be monospaced
     */
    public GameComponent(GameMap<TextBasedTile> map, Font font) {
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
        for (int i = 0; i < this.map.getRows(); i++) {
            for (int j = 0; j < this.map.getCols(); j++) {
                g.drawString("" + this.map.getTile(i, j).getRepresentation(),
                             i * charWidth,
                             j * charHeight);
            }
        }
    }
}