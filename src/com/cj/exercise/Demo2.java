package com.cj.exercise;

import java.util.Arrays;

/**
 * @Description: https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 * @Author: chenjun
 * @Date: 2021/1/12 16:28
 */
public class Demo2 {
    static Integer[] nums1 = new Integer[]{1, 3};
    static Integer[] nums2 = new Integer[]{2, 3, 15, 20, 6};

    public static void main(String[] args) {
        calc(nums1, nums2);
    }


    static <T> void calc(T[] nums1, T[] nums2) {
        T[] concatArr = concat(nums1, nums2);
        Arrays.sort(concatArr);
        System.out.println("数组为：" + Arrays.asList(concatArr).toString());
        int[] arr = new int[concatArr.length];
        for (int i = 0; i < concatArr.length; i++) {
            arr[i] = (Integer) concatArr[i];
        }
        float average = getAverage(arr);
        System.out.println("平均数为：" + average);
        float median = getMedian(arr);
        System.out.println("中位数为：" + median);

    }

    /**
     * 合并数组
     */
    static <T> T[] concat(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    /**
     * 合并多个数组
     */
    static <T> T[] concatAll(T[] first, T[]... rest) {
        int totalLength = first.length;
        for (T[] array : rest) {
            totalLength += array.length;
        }
        T[] result = Arrays.copyOf(first, totalLength);
        int offset = first.length;
        for (T[] array : rest) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }

    /**
     * 计算平均数
     */
    static float getAverage(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (float) sum / (float) arr.length;
    }

    /**
     * 求中位数，数组个数为偶数时，最中间两个数的平均数即为中位数，数组个数为奇数时，最中间的数即为中位数；
     */
    static float getMedian(int[] arr) {
        float median = 0;
        if (arr.length % 2 == 0) {
            // 分割数
            int[] arr1 = Arrays.copyOf(arr, arr.length / 2);
            int[] arr2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
            median = (arr1[arr1.length - 1] + arr2[0]) / 2f;
        } else {
            median = arr[arr.length / 2];
        }
        return median;
    }
}
