package com.algorithm.sort;

import java.util.Arrays;

/**
 * @Description: 冒泡排序算法
 * @Author: chenjun
 * @Date: 2021/2/6 10:24
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, -1, 10, 8};
        bubbleSort(arr);
    }

    /**
     * @Description: 冒泡排序，时间复杂度O(n^2);
     * @Return void
     */
    private static void bubbleSort(int[] arr) {
        // 临时变量，交换的时候用
        int temp;
        // 是否进行过交换
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            } else {
                // 重置flag，进行下次判断
                flag = false;
            }
            System.out.println("第" + (i + 1) + "轮排序后的数组：" + Arrays.toString(arr));
        }
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }
}
