package com.company;

import com.sun.org.apache.bcel.internal.generic.BALOAD;

public class BattleController {

    int totalPlayers = 24;
    int alivePlayers = totalPlayers;
    Gender gender;
    int heath, attackLevel, defenceLevel;

    Player[] players = new Player[totalPlayers];

    public BattleController() {


    }
}




