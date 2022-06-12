package com.second;

import java.util.Scanner;

public class spanofanarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int [] arr  = new int[number];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < number;i++){
            arr[i] = s.nextInt();
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int span = max-min;
        System.out.println("Span of array is " + span);




    }
}
