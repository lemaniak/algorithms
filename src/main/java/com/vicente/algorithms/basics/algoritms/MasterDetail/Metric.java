package com.vicente.algorithms.basics.algoritms.MasterDetail;

/**
 * Created by vicente on 20/03/15.
 */
public class Metric {

    private int id;
    private String name;

    public Metric(int id, String name) {
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

    @Override
    public boolean equals(Object o){
        boolean equals=false;
        if(Metric.class.isInstance(o)){
            Metric m = Metric.class.cast(o);
            if(m.getId()==this.getId()){
                equals=true;
            }
        }
        return equals;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(this.getId());
    }
}
