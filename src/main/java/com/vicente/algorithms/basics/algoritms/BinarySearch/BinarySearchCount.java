package com.vicente.algorithms.basics.algoritms.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by vicente on 20/03/15.
 */
public class BinarySearchCount {

    private static List<Integer> numbers = new ArrayList<Integer>();

    private static void populateNumbers(List<Integer> numbers){
        for(int i = 1; i<=100;i++){
            numbers.add(new Double(Math.random()*50).intValue());
        }
        numbers.add(15);
        Collections.shuffle(numbers);
    }


    /*Equal keys. Add to BinarySearch a static method rank() that takes a key and
    a sorted array of int values (some of which may be equal) as arguments and returns the
    number of elements that are smaller than the key .*/
    public static int search(int number,List<Integer> numbers){
        int max=numbers.size()-1;
        int lower=0;
        while(lower<=max){
            int middle= ((max-lower)/2)+lower;
            if(number>numbers.get(middle)){
                lower=middle+1;
            }else if(number<numbers.get(middle)){
                max=middle-1;
            }else{
                for(int i=middle;i<numbers.size();i++){//iterate the numbers greater than the middle searching duplicates
                    if(numbers.get(middle)==numbers.get(middle+1)){
                        middle++;
                    }else{
                        return middle+1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        populateNumbers(numbers);
        Collections.sort(numbers);
        System.out.println(Arrays.toString(numbers.toArray()));
        System.out.println(search(15,numbers));

    }
}
