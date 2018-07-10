package com.laobaozi.algorithm;

/**
 * Created by jim on 2018/7/3.

 2. 尾部的零
 设计一个算法，计算出n阶乘中尾部零的个数

 样例
 11! = 39916800，因此应该返回 2

 挑战
 O(logN)的时间复杂度

 */
public class Solution1 {

    public long trailingZeros(long n) {
        // write your code here
        long count = 0;
        long temp=n/5;
        while (temp!=0) {
            count+=temp;
            temp/=5;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.trailingZeros(105);
    }

}
