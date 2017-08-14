package com.ducust.algorithm;

import com.ducust.utility.TeData;

import java.util.ArrayList;

/**
 * Created by Custing on 2017/8/14.
 */
public class SelectionSort {

    public ArrayList<Integer> tesSelectionSort(ArrayList<Integer> dSet) {
        System.out.println("unSort: " + dSet);
        int tmp;
        int index;
        for (int i = 0; i < dSet.size(); i++) {
            index = i;

            for (int j = i + 1; j < dSet.size(); j++) {
                if (dSet.get(index) > dSet.get(j)) {
                    index = j;
                }
            }
            if (index != i) {   // be changed to exchange
                tmp = dSet.get(i);
                dSet.set(i, dSet.get(index));
                dSet.set(index, tmp);
            }
        }
        System.out.println("Sorted: " + dSet);
        return dSet;
    }

    public static void main(String[] args) {

        ArrayList<Integer> dSet = new TeData(100, 1000).$randSet();

        new SelectionSort().tesSelectionSort(dSet);

    }

}
