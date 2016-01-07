package com.vicente.algorithms.basics;

import com.vicente.algorithms.basics.algoritms.Sets.comparable.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vicente on 19/03/15.
 */
public class Sandbox {

    private static int[] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


    public static Integer binarySearch(int number, int[] numbers){
        int lower=0;
        int higher=numbers.length-1;
        Integer response = null;
        while(lower<=higher){
            int middle = lower+((higher-lower)/2);
            if(numbers[middle]<number){
                lower=middle+1;
            }else if(numbers[middle]>number){
                higher=middle-1;
            }else{
                return numbers[middle];
            }
        }
        return response;
    }

    public static void main(String[] args) {
       System.out.println(binarySearch(7,numbers));
    }

}
