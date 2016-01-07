package com.vicente.algorithms.basics.algoritms.BinarySearch;

import java.util.Arrays;

/**
 * Created by vicente on 20/03/15.
 */
public class NativeBinarySearch {

    private static int[] numbers = new int[100];
    private static char[] chars= new char[100];


    public static void main(String[]args){
        populate(numbers);
        int response = Arrays.binarySearch(numbers,6);
        System.out.println(response);
        System.out.println("======CHARS====");
        populateChars(chars);
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        char c = (char) Arrays.binarySearch(chars,'c');
        System.out.println(Arrays.toString(chars));
        System.out.println(c);
    }


    private static void populate(int[] numbers){
        for(int i = 0; i<100; i++){
            numbers[i]=i;
        }
    }

    private static void populateChars(char[] chars){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0; i<100; i++){
            chars[i]=alphabet[new Double(Math.random()*alphabet.length-1).intValue()];
        }
    }


}
