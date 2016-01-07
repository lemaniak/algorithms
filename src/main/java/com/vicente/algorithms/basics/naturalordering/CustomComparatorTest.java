package com.vicente.algorithms.basics.naturalordering;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by vicente on 11/05/15.
 */
public class CustomComparatorTest {

    private  static Integer[] numbers = new Integer[20];


    public static void populateArray(Integer[] numbers){
        for(int i = 0 ; i<numbers.length; i++){
            numbers[i]=new Double(Math.random()*100).intValue();
        }
    }

    public static void main(String[]args){
        populateArray(numbers);
        System.out.println("=======UNSORTED ARRAY========"+Arrays.toString(numbers));
        Arrays.sort(numbers,new DescendingComparator());
        System.out.println("=======descending sorted ARRAY========"+Arrays.toString(numbers));
        Arrays.sort(numbers,new AscendingComparator());
        System.out.println("=======ascending sorted ARRAY========"+Arrays.toString(numbers));
    }

    public static class DescendingComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer number1,Integer number2){
            if(number1==number2){
                return 0;
            }else if(number1<number2){
                return 1;
            }else{
                return -1;
            }
        }
    }

    public static class AscendingComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer number1,Integer number2){
            if(number1==number2){
                return 0;
            }else if(number1<number2){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
