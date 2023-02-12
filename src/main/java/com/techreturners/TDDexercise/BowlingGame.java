package com.techreturners.TDDexercise;

public class BowlingGame {
    public int getBowlingScore(String AllFramesScore){
        //iterate through the each char of string and convert it into int and add them all
        int score=0;
        for(int roll=0;roll<AllFramesScore.length();roll++){
            //check if the character is digit and add it

            if(roll<AllFramesScore.length()-1 && Character.isDigit(AllFramesScore.charAt(roll)) && AllFramesScore.charAt(roll+1)=='/'){
                if(roll<AllFramesScore.length()-3) {
                    score = score + 10 + Character.getNumericValue(AllFramesScore.charAt(roll + 3));
                }
                else{
                    score = score + 10 + Character.getNumericValue(AllFramesScore.charAt(roll + 2));
                    break;
                }
            }

            else if(AllFramesScore.charAt(roll) == 'X'){
               score=score+10+Character.getNumericValue(AllFramesScore.charAt(roll + 2));
                       //+Character.getNumericValue(AllFramesScore.charAt(roll + 3));
            }

            else if(Character.isDigit(AllFramesScore.charAt(roll))){
                score=score+Character.getNumericValue(AllFramesScore.charAt(roll));
            }
        }
          return score;
    }
}
