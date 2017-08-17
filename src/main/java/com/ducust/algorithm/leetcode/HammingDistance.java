package com.ducust.algorithm.leetcode;

/**
 * Created by Custing on 2017/8/17.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {

        String xBynary = Integer.toBinaryString(x);
        String yBynary = Integer.toBinaryString(y);

        int dif;
        if (xBynary.length() >= yBynary.length()) {
            dif = caseDif(xBynary, yBynary);
        } else {
            dif = caseDif(yBynary, xBynary);
        }

        return dif;
    }

    private int caseDif(String a, String b) {
        int dif = 0;

        int bsiz = b.length() - 1;

        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.length() == b.length()) {             //长度相同 不作 短处理
                if (a.charAt(i) != b.charAt(i)) {
                    dif++;
                }
            } else {                                    // 长度不同 短处理

                if (bsiz >= 0) {
                    if (a.charAt(i) != b.charAt(bsiz)) {
                        dif++;
                    }
                    bsiz--;
                } else {
                    if (a.charAt(i) != '0') {
                        dif++;
                    }
                }

            }
        }

        return dif;
    }

}
