package com.techreturners.TDDexercise;

public class BowlingGame {
    private int score;
    private int roll;

    public int getBowlingScore(String AllFramesScore) {

        for (roll = 0; roll < AllFramesScore.length(); roll++) {

            if (roll < AllFramesScore.length() - 2 && Character.isDigit(AllFramesScore.charAt(roll)) && AllFramesScore.charAt(roll + 1) == '/') {
                score = score+getScoreForSpareFrame(AllFramesScore);
                if (roll == AllFramesScore.length() - 3) {
                    break;
                }
            } else if (roll < AllFramesScore.length() - 4 && AllFramesScore.charAt(roll) == 'X') {
                score = score + getScoreForStrikeFrame(AllFramesScore);
            } else if (Character.isDigit(AllFramesScore.charAt(roll))) {
                score = score + Character.getNumericValue(AllFramesScore.charAt(roll));
            }
        }
        return score;
    }

    private int getScoreForStrikeFrame(String strikeFrames) {
        score = 10;
        if (Character.isDigit(strikeFrames.charAt(roll + 2)) && Character.isDigit(strikeFrames.charAt(roll + 3))) {
            score = score + Character.getNumericValue(strikeFrames.charAt(roll + 2)) + Character.getNumericValue(strikeFrames.charAt(roll + 3));
        } else if (Character.isDigit(strikeFrames.charAt(roll + 2)) && strikeFrames.charAt(roll + 3) == '-') {
            score = score + Character.getNumericValue(strikeFrames.charAt(roll + 2));
        } else if (Character.isDigit(strikeFrames.charAt(roll + 2)) && strikeFrames.charAt(roll + 3) == '/') {
            score = score + 10;
        } else if (strikeFrames.charAt(roll + 2) == 'X') {
            score = score + 10;

            if (Character.isDigit(strikeFrames.charAt(roll + 4))) {
                score = score + Character.getNumericValue(strikeFrames.charAt(roll + 4));
            } else if (strikeFrames.charAt(roll + 4) == 'X') {
                score = score + 10;
            }
        }
        return score;
    }

    private int getScoreForSpareFrame(String spareFrames) {
        score=10;
        if (roll < spareFrames.length() - 3) {
            score = score + Character.getNumericValue(spareFrames.charAt(roll + 3));
        } else {
            score = score + Character.getNumericValue(spareFrames.charAt(roll + 2));
        }
        return score;
    }
}
