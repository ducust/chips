package com.ducust.algorithm.leetcode;

/**
 * Created by Custing on 2017/8/16.
 */
public class Solution {


    /**
     * Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
     * judge if this robot makes a circle, which means it moves back to the original place.
     *
     *The move sequence is represented by a string. And each move is represent by a character.
     *The valid robot moves are R (Right), L (Left), U (Up) and D (down).
     *The output should be true or false representing whether the robot makes a circle.
     * @param moves move code
     * @return
     */
    public boolean judgeCircle(String moves) {

        Boolean moveStatus = true;
        char[] movesByte = moves.toCharArray();
        int sizeR = 0, sizeL = 0, sizeU = 0, sizeD = 0;

        for(int i =0; i < movesByte.length; i++){
            switch (movesByte[i]){
                case 'R' : sizeR++; break;
                case 'L' : sizeL++; break;
                case 'U' : sizeU++; break;
                case 'D' : sizeD++; break;
            }
        }
        if (sizeR - sizeL != 0 || sizeU - sizeD != 0) {
            moveStatus = false;
        }
        return moveStatus;
    }


    public static void main(String[] args) {
        new Solution().judgeCircle("UD");
    }
}
