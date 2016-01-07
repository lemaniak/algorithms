package com.vicente.algorithms.basics.algoritms;

import java.util.*;

/**
 * Created by vicente on 20/03/15.
 */
public class RemoveDuplicates {

    // Create an array with all unique elements
    public static Object[] removeDuplicates(int[] numbers) {
        Set<Integer> response = new HashSet<Integer>();
        for(int i : numbers){
            response.add(i);
        }

        return response.toArray();
    }

    // Create an array with all unique elements
    public static int[] removeDuplicates2(int[] numbers) {
        Set<Integer> response = new HashSet<Integer>();
        for(int i : numbers){
            response.add(i);
        }

        int[] resp=new int[response.size()];
        int index=0;
        for(Integer i : response){
            resp[index]=i;
            index++;
        }
        return resp;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 3};
        Object[] resp = removeDuplicates(arr);
        System.out.println(Arrays.toString(resp));
    }

}
