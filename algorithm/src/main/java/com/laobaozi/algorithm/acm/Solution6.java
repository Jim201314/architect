package com.laobaozi.algorithm.acm;


/**
 * Created by jim on 2018/7/3.
 * 数组中取K大值
 */
public class Solution6 {

    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */

    public int kthLargestElement(int k, int[] nums) {
        if (k < 1 || nums == null) {
            return 0;
        }

        return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
    }

    public static int getKth(int k, int[] nums, int start, int end) {

        int pivot = nums[end];

        int left = start;
        int right = end;

        while (true) {

            while (nums[left] < pivot && left < right) {
                left++;
            }

            while (nums[right] >= pivot && right > left) {
                right--;
            }

            if (left == right) {
                break;
            }

            swap(nums, left, right);
        }

        swap(nums, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return getKth(k, nums, start, left - 1);
        } else {
            return getKth(k, nums, left + 1, end);
        }
    }

    public static void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }


    public static void main(String[] args) {
        int[] nums = {1, 52, 31, 2, 4, 12, 22, 18};
        Solution6 solution6 = new Solution6();
        int i = solution6.kthLargestElement(5, nums);
    }
}
