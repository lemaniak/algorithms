package com.vicente.algorithms.basics.algoritms.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by vicente on 19/03/15.
 */
public class BinarySearch {

    private static List<Integer> numbers = new ArrayList<Integer>();


    private static void populateNumbers(List<Integer> numbers){
        for(int i = 1; i<=100;i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
    }


    public static int search(int number,List<Integer> numbers){
        int iterations=0;
        int low=0;
        int high=numbers.size()-1;
        while(low<=high){
            iterations++;
            int middle = low + (high-low)/2;
            if(number>numbers.get(middle)){
                low=middle+1;
            }else if(number<numbers.get(middle)){
                high=middle-1;
            }else{
                System.out.println("Iterations"+iterations);
                return numbers.get(middle);
            }
        }
        System.out.println("Iterations"+iterations);
        return -1;
    }

    public static void main(String[] args){
        populateNumbers(numbers);
        Collections.sort(numbers);
        System.out.println(Arrays.toString(numbers.toArray()));
        int number = search(15,numbers);
        System.out.println("the number="+number);

    }
}
