package com.company;
import  java.util.Random;

public class Player {

    Random rand = new Random();
    private int playerId;
    private int heath = rand.nextInt(100) + 1;
    private int attackLevel = rand.nextInt(100) + 1;
    private int defenceLevel = rand.nextInt(100) + 1;

    public Player(int playerId, int heath, int attackLevel, int defenceLevel) {
        this.playerId = playerId;
        this.heath = heath;
        this.attackLevel = attackLevel;
        this.defenceLevel = defenceLevel;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;


    }
}