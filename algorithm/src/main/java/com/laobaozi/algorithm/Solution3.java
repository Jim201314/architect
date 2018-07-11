package com.laobaozi.algorithm;

/**
 *
    计算数字k在0到n中的出现的次数，k可能是0~9的一个值
    例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，我们发现1出现了5次 (1, 10, 11, 12)

 */
public class Solution3 {

    public int digitCounts(int k, int n) {
        if(k == n ) {
            return 1;
        }
        StringBuffer s = new StringBuffer();
        for (int i = 0; i <= n; i++) {
            s.append(i + "");
        }
        String news = s.toString();
        String replacenew = news.replace(k+"", "");
        int count = news.length() - replacenew.length();
        return count;
    }


    public static void main(String[] args) {
       Solution3 solution3 = new Solution3();
       solution3.digitCounts(5, 12);
    }
}
