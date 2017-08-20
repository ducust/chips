package com.ducust.algorithm.leetcode;

/**
 * Created by Custing on 2017/8/19.
 */
public class ArrayPairSumI {

    public int arrayPairSum(int[] nums) {

        int result = 0;
        nums = quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length - 1; ) {

            result = result + Math.min(nums[i], nums[i + 1]);
            i += 2;
        }
        return result;
    }

    private int[] BubbleSortNums(int[] nums) {          //Time Limit Exceeded

        for (int i = 0; i < nums.length - 1; i++) {

            int tmp;
            for (int j = nums.length - 1; j >= 1; j--) {
                if (nums[j] < nums[j - 1]) {
                    tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }

            }
        }

        return nums;
    }

    /**
     * the complexity of algorithm worst case is O(n^2) bast is O(nlogn)
     * @param nums      array
     * @param startIn   start index
     * @param endIn     end index
     * @return
     */
    private int[] quickSort(int[] nums, int startIn, int endIn) {
        if (startIn >= endIn) {
            return nums;
        }
        int border = patition(nums, startIn, endIn);
        if (startIn < border) quickSort(nums, startIn, border - 1);
        if (endIn > border) quickSort(nums, border + 1, endIn);

        return nums;
    }

    private int patition(int[] nums, int startIn, int endIn) {
        int border = nums[(startIn + endIn) / 2];
        while (startIn < endIn) {
            while (startIn < endIn && nums[endIn] > border) {
                endIn--;
            }
            nums[startIn] = nums[endIn];

            while (startIn < endIn && nums[startIn] < border) {
                startIn++;
            }
            nums[endIn] = nums[startIn];
        }
        nums[endIn] = border;
        return endIn;
    }


    public static void main(String[] args) {

        int[] nums = {1, 4, 3, 2};
        System.out.println(new ArrayPairSumI().arrayPairSum(nums));

    }

}
