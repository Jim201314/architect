package com.laobaozi.algorithm;

/**
 * Created by jim on 2018/7/3.
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
        String s = "1112121";
        String[] news = s.split("1");
        System.out.print(news.length);

    }
}
