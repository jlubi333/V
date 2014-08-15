package core;

public abstract class Tile {
    private String name;
    private boolean isBlocked;

    protected Tile(String name, boolean isBlocked) {
        this.name = name;
        this.isBlocked = isBlocked;
    }

    public String getName() {
        return this.name;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }
}
