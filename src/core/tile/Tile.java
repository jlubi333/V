package core.tile;

public abstract class Tile {
    private String name;
    private boolean isBlocked;
    private TileDisplay tileDisplay;

    protected Tile(String name, boolean isBlocked, TileDisplay tileDisplay) {
        this.name = name;
        this.isBlocked = isBlocked;
        this.tileDisplay = tileDisplay;
    }

    public String getName() {
        return this.name;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public TileDisplay getTileDisplay() {
        return this.tileDisplay;
    }
}
