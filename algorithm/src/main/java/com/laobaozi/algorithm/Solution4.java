package com.laobaozi.algorithm;

/**
 * Created by jim on 2018/7/3.
 *
            设计一个算法，找出只含素因子2，3，5 的第 n 小的数。
            符合条件的数如：1, 2, 3, 4, 5, 6, 8, 9, 10, 12...
 *
 */
public class Solution4 {

    public boolean isUgryNumber(int number) {
            while (number % 2 == 0) {
                number /= 2;
            }
            while (number % 3 == 0) {
                number /= 3;
            }
            while (number % 5 == 0) {
                number /= 5;
                return (number == 1) ? true : false;
            }
        return true;
    }

    public int digitCounts(int n) {
        return 1;
    }


    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.isUgryNumber(5));


    }
}
