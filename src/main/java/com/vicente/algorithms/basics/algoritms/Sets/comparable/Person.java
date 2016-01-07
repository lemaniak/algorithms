package com.vicente.algorithms.basics.algoritms.Sets.comparable;

/**
 * Created by vicente on 20/03/15.
 */
public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public boolean equals(Object o){
        if(!Person.class.isInstance(o)){
            return false;
        }else{
            Person aux = Person.class.cast(o);
            if(aux.getName().equalsIgnoreCase(this.getName())){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public int hashCode(){
        return this.name.toLowerCase().hashCode();
    }

}
