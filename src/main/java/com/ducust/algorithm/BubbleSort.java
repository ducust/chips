package com.ducust.algorithm;

import com.ducust.utility.TeData;

import java.util.ArrayList;

/**
 * Created by Custing on 2017/8/13.
 */
public class BubbleSort {


    public void tedBubbleSort(ArrayList<Integer> dSet) {
        System.out.println("unSort: " + dSet);
        int tmp;
        for (int i = 1; i < dSet.size(); i++) {

            for (int j = 0; j < dSet.size() - i; j++) {

                if (dSet.get(j) > dSet.get(j + 1)) {

                    tmp = dSet.get(j);
                    dSet.set(j, dSet.get(j + 1));
                    dSet.set(j + 1, tmp);
                }
            }
        }
        System.out.println("Sorted: " + dSet);
    }


    public static void main(String[] args) {

        ArrayList<Integer> dSet = new TeData(100, 1000).$randSet();

        new BubbleSort().tedBubbleSort(dSet);

    }

}
