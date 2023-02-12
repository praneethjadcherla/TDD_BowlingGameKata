package com.techreturners.TDDexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void getScoreforNumbers(){
        BowlingGame bowlingGame=new BowlingGame();

        String AllFramesScore="54 54 54 54 54 54 54 54 54 54";

        assertEquals(90,bowlingGame.getBowlingScore(AllFramesScore));
    }


    @Test
    public void getScoreforMissedKnocks(){
        BowlingGame bowlingGame=new BowlingGame();

        String AllFramesScore="9- 8- 9- 9- 9- 9- 9- 9- 9- 9-";

        assertEquals(89,bowlingGame.getBowlingScore(AllFramesScore));
    }

    @Test
    public void getScoreForSpareFrame(){
        BowlingGame bowlingGame=new BowlingGame();

        String AllFramesScore="5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 54";

        assertEquals(144,bowlingGame.getBowlingScore(AllFramesScore));
    }

    @Test
    public void getScoreForSpareFrameWithMiss(){
        BowlingGame bowlingGame=new BowlingGame();

        String AllFramesScore="5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5-";

        assertEquals(140,bowlingGame.getBowlingScore(AllFramesScore));
    }

    @Test
    public void getScoreForAllSpareFrames(){
        BowlingGame bowlingGame=new BowlingGame();

        String AllFramesScore="5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5";

        assertEquals(150,bowlingGame.getBowlingScore(AllFramesScore));
    }

    @Test
    public void getScoreForStrike(){
        BowlingGame bowlingGame=new BowlingGame();

        String AllFramesScore="X 54 54 54 54 54 54 54 54 54";

        assertEquals(100,bowlingGame.getBowlingScore(AllFramesScore));
    }

    @Test
    public void getScoreForStrikeAndMiss(){
        BowlingGame bowlingGame=new BowlingGame();

        String AllFramesScore="X 5- 54 54 54 54 54 54 54 54";

        assertEquals(92,bowlingGame.getBowlingScore(AllFramesScore));
    }
}
