package com.vicente.algorithms.basics.algoritms;

/**
 * Created by vicente on 19/03/15.
 */
public class FindMaxValue {

    private static int[] numbers= {0,1,2,3,4,5,6,7,8,9};

    public static void main(String[]args){
        System.out.println(getMaxValue(numbers));
    }

    private static int getMaxValue(int[] numbers){
        int max=numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
}
