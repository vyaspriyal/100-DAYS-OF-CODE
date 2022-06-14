package com.second;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello world");
        int [] arr = {1,2,3,4,5,1,1,2,3,};
        boolean result = true;
        Set <Integer> srr = new HashSet<Integer>();
        for(int i = 0 ; i < arr.length;i++){
            if(srr.contains(arr[i])){
                result = false;
            }
            else {
                srr.add(arr[i]);
            }
        }
        System.out.println(result);
        System.out.println("Unique value from set");
        for(int s : srr){
            System.out.print(s);
        }
    }
}
