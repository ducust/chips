package com.ducust.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Custing on 2017/8/21.
 */
public class ValidParentheses {

    public boolean isValid(String s) { //stack

        Boolean isValid = true;
        char[] arrs = s.toCharArray();

        Map arrMap = new HashMap<Character, Character>();
        arrMap.put('(', ')');
        arrMap.put('[', ']');
        arrMap.put('{', '}');

        ArrayList<Character> arrl = new ArrayList<>();

        for (int i = 0; i < arrs.length; i++) {
            if (arrMap.get(arrs[i]) != null) {
                arrl.add(arrs[i]);
            } else if (!arrl.isEmpty() &&
                    (char) arrMap.get(arrl.get(arrl.size() - 1)) == arrs[i]) {
                arrl.remove(arrl.size() - 1);
            } else {
                return false;
            }
            isValid = arrl.isEmpty();
        }
        return isValid;
    }

    public static void main(String[] args) {

        Boolean x = new ValidParentheses().isValid("(({{[[]]}}))");
        System.out.println(x);
    }
}
