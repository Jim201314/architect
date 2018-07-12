package com.laobaozi.algorithm.acm;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by jim on 2018/7/3.
 *
 翻转游戏：给定一个只包含两种字符的字符串：+和-，你和你的小伙伴轮流翻转"++"变成"--"。当一个人无法采取行动时游戏结束，另一个人将是赢家。
 编写一个函数，计算字符串在一次有效移动后的所有可能状态。
 *
 */
public class Solution5 {

    public List<String> generatePossibleNextMoves(String s) {
        // write your code here
        List<String> str = new ArrayList<>();

        for(int i = 0; i<s.length()-1; i++ ) {
            String [] ss = s.split("");
            String[] test = ss;
            if (test[i].equals("+") && test[i + 1].equals("+")) {
                test[i] = "-";
                test[i + 1] = "-";
                String strval = arrayToString(test);
                str.add(strval);
            }
        }

        return str;

    }

    public String arrayToString(String[] str) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            build.append(str[i]);
        }
        return build.toString();

    }



    public static void main(String[] args) {
       String test = "++++++-----++";
       Solution5 solution5 = new Solution5();
       solution5.generatePossibleNextMoves(test);

    }
}
