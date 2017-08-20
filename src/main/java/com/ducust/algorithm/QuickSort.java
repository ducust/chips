package com.ducust.algorithm;

import com.ducust.utility.TeData;

import java.util.ArrayList;

/**
 * Created by Custing on 2017/8/20.
 */
public class QuickSort {

    private int partition(ArrayList<Integer> nums, int startInx, int endInx) {
        int board = nums.get((startInx + endInx) / 2);
        while (startInx < endInx) {
            while (startInx < endInx && nums.get(endInx) >= board) {
                endInx--;
            }
            nums.set(startInx, nums.get(endInx));
            while (startInx < endInx && nums.get(startInx) <= board) {
                startInx++;
            }
            nums.set(endInx, nums.get(startInx));
        }
        nums.set(endInx, board);
        return endInx;
    }


    public ArrayList<Integer> tedQuickSort(ArrayList<Integer> nums, int startInx, int endInx) {

        if (startInx >= endInx) {
            return nums;
        }
        int border = partition(nums, startInx, endInx);

        if (startInx < border) tedQuickSort(nums, startInx, border - 1);
        if (endInx > border) tedQuickSort(nums, border + 1, endInx);

        return nums;
    }

    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            ArrayList tes = new TeData(10, 1000).$randSet();
            System.out.println(i + "1: " + tes);

            System.out.println(i + "2: " + new QuickSort().tedQuickSort(tes, 0, tes.size() - 1));
        }

    }


}
