package core.tile;

import java.awt.*;

public class TileDisplay {
    private char representation;
    private Color color, backgroundColor;

    public TileDisplay(char representation, Color color, Color backgroundColor) {
        this.representation = representation;
        this.color = color;
        this.backgroundColor = backgroundColor;
    }

    public char getRepresentation() {
        return this.representation;
    }

    protected void setRepresentation(char representation) {
        this.representation = representation;
    }

    public Color getColor() {
        return this.color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    protected void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
