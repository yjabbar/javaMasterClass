package com.company;

public class Player

{
    private int playerId;
    private  String Gender;
    private int AttackLevel;
    private  int DefenceLevel;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAttackLevel() {
        return AttackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        AttackLevel = attackLevel;
    }

    public int getDefenceLevel() {
        return DefenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        DefenceLevel = defenceLevel;
    }

    public int getHealthLevel() {
        return HealthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        HealthLevel = healthLevel;
    }

    private  int HealthLevel;

}
