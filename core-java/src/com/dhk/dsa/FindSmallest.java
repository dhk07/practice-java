package com.dhk.dsa;

import java.util.*;
import java.util.stream.IntStream;

public class FindSmallest {

    public static void main(String[] args) {
        int[] numbers = new int[]{45,23,78,12,76,23};
        smallestUsingStream(numbers);
//        System.out.println("Smallest number in "+ Arrays.toString(numbers) +" is : "+findSmallest(numbers));
    }
    private static int findSmallest(int[] input){
        int smallest = input[0];
        for(int i=1;i<input.length;i++){
            if(input[i]< smallest)
                smallest = input[i];
        }
        return smallest;
    }
    private static OptionalInt smallestUsingStream(int[] input){
        OptionalInt smallestNumber = IntStream.of(input).reduce(Math::min);

        smallestNumber.ifPresent(num -> System.out.println("Smallest number is : "+num));
        return smallestNumber;
    }
}
