package com.company;

public class Career extends Player {
    public Career(Gender gender, int heath, int attackLevel, int defenceLevel, int playerId) {
        super(gender, heath, attackLevel, defenceLevel, playerId);
    }
    Player careerPlayer = new Player(Gender.MALE, 100, 120, 100);

}


