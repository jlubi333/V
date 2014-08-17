package core;

public class Location {
    public int row;
    public int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Location plus(Location other) {
        return new Location(this.row + other.row, this.col + other.col);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Location)) {
            return false;
        }
        Location otherLocation = (Location) other;
        return this.row == otherLocation.row && this.col == otherLocation.col;
    }

    @Override
    public String toString() {
        return "Location[row=" + this.row + ", col=" + this.col + "]";
    }
}
