package com.ducust.utility;

import java.util.ArrayList;

/**
 * Created by Custing on 2017/8/13.
 */
public class TeData {

    private ArrayList<Integer> randSet;

    public TeData() {
        this.randSet = mkSet(10, 10);
    }

    public TeData(int len, int seed) {
        this.randSet = mkSet(len, seed);
    }

    private ArrayList<Integer> mkSet(int len, int seed) {
        ArrayList<Integer> numSet = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            numSet.add(randomNum(seed));
        }
        return numSet;
    }

    private int randomNum(int seed) {
        return (int) (Math.random() * seed);
    }

    public ArrayList<Integer> $randSet() {
        return randSet;
    }
}
