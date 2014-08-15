package core;

public abstract class Move {
    public int power, accuracy;

    public enum Type {
        PHYSICAL, STATUS
    }

    public int getPower() {
        return this.power;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    // Go go = new Go();
    public abstract void move(Battler sender, Battler target);
}