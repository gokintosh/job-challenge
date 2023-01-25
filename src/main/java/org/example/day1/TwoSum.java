package org.example.day1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target=6;

        int[] result=twoSum(nums,target);

        Arrays.stream(result).forEach(System.out::println);
    }


    public static int[] twoSum(int[] numArray,int target){


        int n=numArray.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            int delta = target-numArray[i];
            if(map.containsKey(delta)){
                return new int[]{map.get(delta),i};
            }
            else {
                map.put(numArray[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}