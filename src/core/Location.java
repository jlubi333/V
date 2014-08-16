package core;

public class Location {
    public int row;
    public int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Location[row=" + this.row + ", col=" + this.col + "]";
    }
}
