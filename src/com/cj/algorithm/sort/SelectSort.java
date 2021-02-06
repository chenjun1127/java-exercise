package com.cj.algorithm.sort;

import java.util.Arrays;

/**
 * @Description: 选择排序算法
 * @Author: chenjun
 * @Date: 2021/2/6 11:07
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        selectSort(arr);
    }
    /**
     * @Description: 选择排序，时间复杂度O(n^2);
     * @Return void
     */
    private static void selectSort(int[] arr) {
        // 经过arr.length - 1轮的排序
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            System.out.println("第" + (i + 1) + "轮排序后的数组：" + Arrays.toString(arr));
        }
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }
}
