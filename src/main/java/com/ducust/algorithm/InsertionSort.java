package com.ducust.algorithm;

import com.ducust.utility.TeData;

import java.util.ArrayList;

/**
 * Created by Custing on 2017/8/15.
 */
public class InsertionSort {

    public ArrayList<Integer> tesInsertionSort(ArrayList<Integer> dSet) {

        int i, j, t;
        System.out.println("unSort: " + dSet);
        for (i = 1; i < dSet.size(); i++) {
            t = dSet.get(i);
            j = i - 1;

            while (j >= 0 && dSet.get(j) > t) {
                dSet.set(j + 1, dSet.get(j));
                j--;
            }
            dSet.set(j + 1, t);
        }
        System.out.println("Sorted: " + dSet);
        return dSet;
    }

    public static void main(String[] args) {

        ArrayList<Integer> dSet = new TeData(100, 1000).$randSet();

        new InsertionSort().tesInsertionSort(dSet);

    }

}
