package com.laobaozi.algorithm.acm;


/**
 * Created by jim on 2018/7/3.
 * <p>
 * 给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 * 在数组上原地旋转，使用O(1)的额外空间
 */
public class Solution8 {

    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        char temp;
        if(offset==0) {
            return;
        }
        if(str.length==0) {
            return;
        }
        int len=str.length;
        for(int i=1;i<=offset%len;i++){
            temp=str[len-1];
            int j=len-2;
            while(j>=0){
                str[j+1]=str[j];
                j--;
            }
            str[0]=temp;
        }

    }


    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e', 'f', 'g'};
        Solution8 solution8 = new Solution8();
        solution8.rotateString(arr, 3);
    }
}
