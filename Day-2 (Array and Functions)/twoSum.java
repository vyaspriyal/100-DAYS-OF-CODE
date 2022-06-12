package com.second;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[]  twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length;i++){

           if(map.containsKey(target-nums[i])){
            int []  arr = {map.get(target - nums[i]),i};
            return arr;
           }
           else{
               map.put(nums[i],i);
           }


        }
        int [] arr = {};
        return arr;
    }

    public static void main(String[] args) {
        int []  nums = {2,5,7,9};
        int target = 9;
        int [] arr = twoSum(nums,target);
        System.out.println(Arrays.toString(arr));
    }
}
