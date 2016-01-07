package com.vicente.algorithms.basics.naturalordering;

import java.util.*;

/**
 * Created by vicente on 19/03/15.
 */
public class BasicOrderingTests {

    private static Integer[] integers= new Integer[100];
    private static char[] characters= "mnbvcxzñlkjhgfdsapoiuytrewq".toCharArray();
//    private static String[] strings= new String[10];
    private static String[] strings= {"Beto","Vicente","Valerie","Masiel","Alberto"};
    private static List<OrderedPerson> persons = new ArrayList<OrderedPerson>();

    private static void populateArray(Integer[] array){
        for(int i =0; i<array.length; i++){
            array[i]=new Double(Math.random()*9999).intValue();
        }
    }

    private static void populateStringArray(String[] array){
        for(int i = 0; i<array.length;i++){
            array[i]= UUID.randomUUID().toString();
        }
    }

    private static void populatePersons(){
            persons.add(new OrderedPerson(new Double(Math.random()*30).intValue(),"vicente"));
            persons.add(new OrderedPerson(new Double(Math.random()*30).intValue(),"masiel"));
            persons.add(new OrderedPerson(new Double(Math.random()*30).intValue(),"alberto"));
            persons.add(new OrderedPerson(new Double(Math.random()*30).intValue(),"valerie"));
            persons.add(new OrderedPerson(new Double(Math.random()*30).intValue(),"randy"));
    }

    public static void main(String[] args){


//        //========INTEGERS
//        System.out.println("=========INTEGERS===========");
//        populateArray(integers);
//        //print the unsorted array of integers
//        System.out.println(Arrays.toString(integers));
//        //sort the array of integers
//        Arrays.sort(integers);//the natural ordering of integers is based on the value of the number
//        //print the array of integers
//        System.out.println(Arrays.toString(integers));
//
//        //========CHARACTERS
//        //print the unsorted characters array
//        System.out.println("=========CHARACTERS===========");
//        System.out.println(characters);
//        Arrays.sort(characters);
//        System.out.println(characters);
//        //========STRINGS
//        System.out.println("=========STRINGS===========");
////        populateStringArray(strings);
//        System.out.println(Arrays.toString(strings));
//        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));

        //========ORDEREDPERSONS
        System.out.println("=========ORDERED OBJECTS===========");
        populatePersons();
        StringBuilder stringBuilder = new StringBuilder();
        for(OrderedPerson op : persons){
            stringBuilder.append(op.toString()+",");
        }
        System.out.println(stringBuilder.toString());
        Collections.sort(persons);
        stringBuilder = new StringBuilder();
        for(OrderedPerson op : persons){
            stringBuilder.append(op.toString()+",");
        }
        System.out.println(stringBuilder.toString());
    }
}
