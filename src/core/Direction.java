package core;

public enum Direction {
    UP, RIGHT, DOWN, LEFT;

    public static Location getDisplacementLocation(Direction d) {
        switch(d) {
            case UP:
                return new Location(-1, 0);
            case RIGHT:
                return new Location(0, 1);
            case DOWN:
                return new Location(1, 0);
            case LEFT:
                return new Location(0, -1);
        }
        return null;
    }
}
