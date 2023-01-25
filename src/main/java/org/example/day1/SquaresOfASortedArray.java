package org.example.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfASortedArray {

    public static void main(String[] args) {

        int[] testArray={-4,-1,0,3,10};

        int[] result=sortedSquare(testArray);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] sortedSquare(int[] nums){
        return Arrays.stream(nums).map(n->n*n).sorted().toArray();
    }
}
