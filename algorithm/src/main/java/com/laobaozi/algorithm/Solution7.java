package com.laobaozi.algorithm;


/**
 * Created by jim on 2018/7/3.
 * <p>
 * 描述
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * <p>
 * 样例
 * 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 * <p>
 * 挑战
 * 你能否优化你的算法，如果其中一个数组很大而另一个数组很小？
 */
public class Solution7 {

    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */

    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int lengthA = A.length;
        int lengthB = B.length;
        int sumLength = lengthA + lengthB;
        int[] smallOne;
        int[] bigOne;
        int[] mergeArray = new int[sumLength];
        if (lengthA > lengthB) {
            smallOne = B;
            bigOne = A;
        } else {
            smallOne = A;
            bigOne = B;
        }
        int small = 0;
        int big = 0;
        boolean smallBoolean = false;
        boolean bigBoolean = false;
        for (int i = 0; i < (smallOne.length + bigOne.length); i++) {
            if(smallBoolean) {
                mergeArray[i] = bigOne[big];
                big ++;
                continue;
            }
            if(bigBoolean) {
                mergeArray[i] = smallOne[small];
                small++;
                continue;
            }

            if (smallOne[small] <= bigOne[big]) {
                mergeArray[i] = smallOne[small];
                small++;

            } else if(big < bigOne.length) {
                mergeArray[i] = bigOne[big];
                big++;
            }else {
                return mergeArray;
            }
            if(small == smallOne.length) {
                small = small -1;
                smallBoolean = true;
            }
            if(big == bigOne.length) {
                big = big-1;
                bigBoolean = true;
            }
        }
        return mergeArray;
    }


    public static void main(String[] args) {
        int[] A = {7};
        int[] B = {5, 7};
        Solution7 solution6 = new Solution7();
        int[] i = solution6.mergeSortedArray(A, B);
        System.out.println(i.toString());
        System.out.println(i);
    }
}
