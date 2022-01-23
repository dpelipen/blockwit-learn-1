package com.blockwit.learn1.dpelipen;

public class TaskTu0 {
    public static void main(String[] args) {
        int[] nums = {12, 7, 89, -4, 8, 9};
        Helper.printIntArray(nums);
        System.out.println();
        System.out.println("Вывод массива после сортировки:");

        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}
