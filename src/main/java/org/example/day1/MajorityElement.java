package org.example.day1;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};

        int ans=majorityElement(nums);
        System.out.println(ans);
    }


    public static Integer majorityElement(int[] nums){

        HashMap<Integer,Integer>numberMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(numberMap.containsKey(nums[i])){
                int value=numberMap.get(nums[i]);
                value++;
                numberMap.put(nums[i],value);
            }
            else {
                numberMap.put(nums[i],1);
            }
        }

        Collection<Integer> numberSet= numberMap.values();
        int max= Collections.max(numberSet);

        for(Map.Entry<Integer,Integer>entry:numberMap.entrySet()){
            if(entry.getValue()==max){
                return entry.getKey();
            }
        }

        numberSet.forEach(System.out::println);
        return -1;
    }
}
