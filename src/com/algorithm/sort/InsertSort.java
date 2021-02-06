package com.algorithm.sort;

import java.util.Arrays;

/**
 * @Description: 插入排序
 * @Author: chenjun
 * @Date: 2021/2/6 13:56
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        insertSort(arr);
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if ((insertIndex + 1) != i) {
                arr[insertIndex + 1] = insertVal;
            }
            System.out.println("第" + i + "轮排序后的数组：" + Arrays.toString(arr));
        }
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }
}
