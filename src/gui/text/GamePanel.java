package gui.text;

import core.GameMap;
import core.Location;
import core.entity.Entity;
import core.tile.TileDisplay;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Font font;
    int charWidth, charHeight;
    private GameMap map;

    /**
     * @param font Should be monospaced
     * @param map  The GameMap to draw
     */
    public GamePanel(Font font, GameMap map) {
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

        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(this.font);
        this.setBackground(Color.BLACK);

        Location loc;
        TileDisplay t;
        for (int r = 0; r < this.map.getRows(); r++) {
            for (int c = 0; c < this.map.getCols(); c++) {
                loc = new Location(r, c);
                t = this.map.getTile(loc).getTileDisplay();
                drawTileDisplay(g, t, loc);
            }
        }

        for(Entity e : this.map.getEntities()) {
            drawTileDisplay(g, e.getTile().getTileDisplay(), e.getLocation());
        }
    }

    private void drawTileDisplay(Graphics g, TileDisplay tileDisplay, Location loc) {
        int x = loc.col * this.charWidth;
        int y = loc.row * this.charHeight;

        g.setColor(tileDisplay.getBackgroundColor());
        g.fillRect(x, y, this.charWidth, this.charHeight);
        g.setColor(tileDisplay.getColor());
        g.drawString("" + tileDisplay.getRepresentation(), x, y + this.charHeight);
    }
}