package com.ducust.algorithm;

import com.ducust.utility.TeData;

import java.util.ArrayList;

/**
 * Copy by Custing on 2017/8/16.
 */
public class HeapSort {

    public void tesHeapSort(ArrayList<Integer> dSet) {

        int n = dSet.size();
        int i, j, h, k;
        int t;
        System.out.println("unSort: " + dSet);
        for (i = n / 2 - 1; i >= 0; i--) {
            while (2 * i + 1 < n) {
                j = 2 * i + 1;
                if ((j + 1) < n) {
                    if (dSet.get(j) < dSet.get(j + 1)) j++;
                }
                if (dSet.get(i) < dSet.get(j)) {
                    t = dSet.get(i);
                    dSet.set(i, dSet.get(j));
                    dSet.set(j, t);

                    i = j;
                } else {
                    break;
                }
            }
        }
        // sort
        for (i = n - 1; i > 0; i--) {
            t = dSet.get(0);
            dSet.set(0, dSet.get(i));
            dSet.set(i, t);
            k = 0;
            while (2 * k + 1 < i) {
                j = 2 * k + 1;
                if ((j + 1) < i) {
                    if (dSet.get(j) < dSet.get(j + 1)) j++;
                }
                if (dSet.get(k) < dSet.get(j)) {

                    t = dSet.get(k);
                    dSet.set(k, dSet.get(j));
                    dSet.set(j, t);
                    k = j;
                } else {
                    break;
                }
            }
        }

        System.out.println("Sorted: " + dSet);
    }

    public static void main(String[] args) {
        new HeapSort().tesHeapSort(new TeData(10000000, 100000000).$randSet());
    }

}
