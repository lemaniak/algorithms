package com.vicente.algorithms.basics.algoritms.Sets.comparable;

import java.util.*;

/**
 * Created by vicente on 20/03/15.
 */
public class FindPersonsUniqueName {

    private static List<Person> persons= new ArrayList<Person>();

    public static void main(String[] args){
        Person p  = new Person("Vicente",31);
        Person p1  = new Person("masiel",31);
        Person p2 = new Person("randy",31);
        Person p3 = new Person("rodolfo",31);
        Person p4  = new Person("juanfred",31);
        Person p5  = new Person("masiel",31);
        Person p6  = new Person("vicente",31);

        persons.add(p);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        Set<Person> resp=findUniqueNames(persons);
        System.out.println(resp.size());
    }


    public static Set<Person> findUniqueNames(List<Person> persons){
        Set<Person> response = new HashSet<Person>();
        for(Person p:persons){
            boolean inserted =response.add(p);
            System.out.println(inserted);
        }
        return response;
    }
}
