package core;

import java.util.ArrayList;

public class Battler {
    private ArrayList<Move> moves;
    private Stat hp, attack, defense, speed;

    public Battler(ArrayList<Move> moves, Stat hp, Stat attack, Stat defense, Stat speed) {
        this.moves = moves;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public ArrayList<Move> getMoves() {
        return this.moves;
    }

    public Stat getHp() {
        return this.hp;
    }

    public Stat getAttack() {
        return this.attack;
    }

    public Stat getDefense() {
        return this.defense;
    }

    public Stat getSpeed() {
        return this.speed;
    }
}
