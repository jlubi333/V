package gui.text;

import core.GameMap;
import core.tile.TextBasedTile;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Font font;
    int charWidth, charHeight;
    private GameMap<TextBasedTile> map;

    /**
     * @param font Should be monospaced
     * @param map  The GameMap to draw
     */
    public GamePanel(Font font, GameMap<TextBasedTile> map) {
        this.font = font;
        FontMetrics fm = this.getFontMetrics(font);
        /*
            W is widest character in non-monospaced fonts,
            so this will help improve the look of the font
            if it happens to be non-monospaced.
        */
        this.charWidth = fm.charWidth('W');
        this.charHeight = fm.getAscent();

        this.map = map;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(this.font);
        this.setBackground(Color.BLACK);

        TextBasedTile t;
        int x, y;
        for (int i = 0; i < this.map.getRows(); i++) {
            for (int j = 0; j < this.map.getCols(); j++) {
                t = this.map.getTile(i, j);
                x = i * this.charWidth;
                y = j * this.charHeight;

                g.setColor(t.getBackgroundColor());
                g.fillRect(x, y, this.charWidth, this.charHeight);
                g.setColor(t.getColor());
                g.drawString("" + t.getRepresentation(), x, y + this.charHeight);
            }
        }
    }
}