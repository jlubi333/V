package core;

import java.awt.*;

// Decouple view from logic
// Make tile an interface
// implement tile with TextBasedTile and maybe GraphicTile for future
public class TextBasedTile extends Tile {
    private char representation;
    private Color color;

    public TextBasedTile(String name, boolean isBlocked, char representation, Color color) {
        super(name, isBlocked);
        this.representation = representation;
        this.color = color;
    }

    public char getRepresentation() {
        return this.representation;
    }

    public void setRepresentation(char representation) {
        this.representation = representation;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
