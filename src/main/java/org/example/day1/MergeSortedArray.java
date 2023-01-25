package org.example.day1;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=6;
        int n=3;

        int[] result=merge(nums1,m,nums2,n);

        Arrays.stream(nums1).forEach(System.out::println);
    }


    private static int[] merge(int[] nums1,int m,int[] nums2,int n){

        int j=0;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0 && i==((nums1.length-n))){
                nums1[i]=nums2[j];
                j++;
            }
        }


        Arrays.sort(nums1);
        return nums1;




    }
}
