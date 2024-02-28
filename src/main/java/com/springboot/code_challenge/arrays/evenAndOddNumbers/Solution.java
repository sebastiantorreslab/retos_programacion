package com.springboot.code_challenge.arrays.evenAndOddNumbers;

import java.util.Arrays;

public class Solution {

    static int[] numbers = {4, 5, 6, 8, 7, 4, 5, 6};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeEvenNumbers(numbers)));

    }

    public static int[] removeEvenNumbers(int[] nums) {
        int numberCount = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                numberCount++;
            }

        }

        int[] oddNumbers = new int[numberCount];
        int counter = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddNumbers[counter++] = num;
            }

        }
        return oddNumbers;
    }
}
