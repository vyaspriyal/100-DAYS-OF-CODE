package com.second;

import java.util.Scanner;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = s.nextInt();
        }
        int number2 = s.nextInt();
        int[] arr2 = new int[number2];
        for (int j = 0; j < number2; j++) {
            arr2[j] = s.nextInt();
        }
        int[] sum = new int[number > number2 ? number : number2];
        int carry = 0;
        int i = arr.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int d = carry;
            if (i >= 0) {
                d += arr[i];

            }
            if (j >= 0) {
                d += arr2[j];

            }
            carry = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            k--;
            j--;
        }
        if (carry != 0) {
            System.out.println(carry);
        }

        for (int val : sum) {
            System.out.println(val);


        }
    }
}
