package com.company;
import  java.util.Random;

public class Player {

    Random rand = new Random();
    private Gender gender;
    private int heath, attackLevel, defenceLevel;

        public Player(Gender gender, int heath, int attackLevel, int defenceLevel) {
        this.heath = rand.nextInt(100+ 1);
        this.attackLevel = rand.nextInt(100+1);
        this.defenceLevel = rand.nextInt(100+1);
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
}