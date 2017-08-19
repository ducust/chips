package com.ducust.algorithm.leetcode;

/**
 * Created by Custing on 2017/8/19.
 */
public class ArrayPairSumI {

    public int arrayPairSum(int[] nums) {

        int result = 0;
        nums = BubbleSortNums(nums);
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


    public static void main(String[] args) {

        int[] nums = {1, 4, 3, 2};


        System.out.println(new ArrayPairSumI().arrayPairSum(nums));


    }

}
