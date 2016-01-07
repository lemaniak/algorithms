package com.vicente.algorithms.basics.algoritms;

import java.util.Arrays;

/**
 * Created by vicente on 19/03/15.
 */
public class ReverseArray {

    private static int[] numbers= {0,1,2,3,4,5,6,7,8,9};

    public static void main(String[]args){
        System.out.println(Arrays.toString(numbers));
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void reverse(int[] numbers){
        int leng=numbers.length-1;
        for(int i=0; i<numbers.length/2;i++){
            int aux = numbers[i];
            numbers[i]=numbers[leng];
            numbers[leng]=aux;
            leng--;
        }
    }
}
