package com.vicente.algorithms.basics.naturalordering;

import java.util.Comparator;

/**
 * Created by vicente on 19/03/15.
 */
public class OrderedPerson implements Comparable<OrderedPerson>{

    private  int age;
    private String name;

    public OrderedPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "name:"+this.name+" age:"+this.age;
    }

    @Override
    public int compareTo(OrderedPerson o) {
      if(o.getAge()==this.getAge()){
          return 0;
      }else if(o.getAge()>this.getAge()){
          return -1;
      }else {
          return 1;
      }
    }
}
