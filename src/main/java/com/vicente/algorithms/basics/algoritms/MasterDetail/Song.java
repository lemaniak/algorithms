package com.vicente.algorithms.basics.algoritms.MasterDetail;

/**
 * Created by vicente on 20/03/15.
 */
public class Song {

    private int id;
    private String name;

    public Song(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
