package com.company;
import  java.util.Random;

public class Player {

    private Gender gender;
    private int heath, attackLevel, defenceLevel, playerId;

    public Player(Gender gender, int heath, int attackLevel, int defenceLevel, int playerId) {
        this.heath = heath;
        this.attackLevel = attackLevel;
        this.defenceLevel = defenceLevel;
        this.playerId = playerId;
        this.gender = gender;
    }

    public Player(Gender gender, int heath, int attackLevel, int defenceLevel) {
    }

    public int getPlayerId () {
            return playerId;
        }
    public void setPlayerId ( int playerId){
            this.playerId = playerId;
        }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
    public boolean isAlive() {
        return heath > 0;
    }

    }


