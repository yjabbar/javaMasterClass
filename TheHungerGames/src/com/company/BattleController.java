package com.company;

import java.util.Random;

public class BattleController {

    int numberOfTotalPlayers = 24;
    int numberOfAliveContestants = numberOfTotalPlayers;
    Player[] players = new Player[numberOfTotalPlayers];

    Gender gender;
    int attackLevel, defenceLevel, heath;
    Random random = new Random();

    public BattleController() {

        for (int i = 0; i < numberOfTotalPlayers; i++) {
            if (i % 2 == 0) {
                attackLevel = random.nextInt(100);
                defenceLevel = random.nextInt(100);
                heath = random.nextInt(100);

                players[i] = new Career(gender, i, attackLevel, defenceLevel, heath);
            } else {
                attackLevel = random.nextInt(100);
                defenceLevel = random.nextInt(100);
                heath = random.nextInt(100);

                players[i] = new District(gender, i, attackLevel, defenceLevel, heath);
            }
        }
        System.out.println(players[0]);
        System.out.println(players[1]);

    }


    }



