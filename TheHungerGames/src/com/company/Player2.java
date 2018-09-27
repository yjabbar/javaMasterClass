package com.company;

public class Player2 {

    public class Player {
        }

        private String name;
        private int attack;
        private int defense;
        private int health;
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Player2(String name, int attack, int defense, int health) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
    }

   }

