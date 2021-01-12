package com.cj.exercise;

import java.util.Arrays;

/**
 * @Description: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。https://leetcode-cn.com/problems/two-sum/
 * @Author: chenjun
 * @Date: 2021/1/12 15:43
 */
public class Demo1 {
    static int[] arr = new int[]{2, 7, 11, 15};
    static int target = 9;

    public static void main(String[] args) {
        int[] num = getNum(arr, target);
        System.out.println(Arrays.toString(num));
    }

    static int[] getNum(int[] arr, int target) {
        int k = 0;
        int[] arr1 = new int[2];
        for (int i : arr) {
            k++;
            for (int j = k; j < arr.length; j++) {
                if (i + arr[j] == target) {
                    arr1[0] = i;
                    arr1[1] = j;
                    break;
                }
            }
        }
        return arr1;
    }
}
