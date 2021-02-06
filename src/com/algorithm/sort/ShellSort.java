package com.algorithm.sort;

import java.util.Arrays;

/**
 * @Description: 希尔排序：它是简单插入排序经过改进之后的一个更高效的版本
 * @Author: chenjun
 * @Date: 2021/2/6 14:23
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(arr);
        shellSort2(arr);
    }

    /**
     * @Description: 交换法希尔排序
     * @Return void
     */
    private static void shellSort(int[] arr) {
        int temp;
        int number = 2;
        int count = 0;
        for (int gap = arr.length / number; gap > 0; gap /= number) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 如果当前元素大于加上步长后的那个元素,说明交换
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("第" + (++count) + "轮排序后的数组：" + Arrays.toString(arr));
        }
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }

    /**
     * @Description: 移位法希尔排序
     * @Return void
     */
    private static void shellSort2(int[] arr) {
        int temp;
        int number = 2;
        int count = 0;
        for (int gap = arr.length / number; gap > 0; gap /= number) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                temp = arr[j];
                // 如果当前元素大于加上步长后的那个元素,说明交换
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
            System.out.println("第" + (++count) + "轮排序后的数组：" + Arrays.toString(arr));
        }
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }
}
