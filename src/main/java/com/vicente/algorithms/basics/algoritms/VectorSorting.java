package com.vicente.algorithms.basics.algoritms;

import com.vicente.algorithms.basics.algoritms.model.Bid;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

/**
 * Created by vicente on 01/08/15.
 */
public class VectorSorting {

    public static void main(String[] args) {
        Vector<Bid> v = new Vector<Bid>();
        populate(v);
        StringBuilder stringBuilder = new StringBuilder();
        for(Bid op : v){
            stringBuilder.append(op.getInitialBid().intValue()+",");
        }
        System.out.println(stringBuilder.toString());
        Comparator<Bid> bidComparator = new Comparator<Bid>() {
            public int compare(Bid o1, Bid o2) {
                return o1.getInitialBid().compareTo(o2.getInitialBid());
            }
        };
        Collections.sort(v, bidComparator);
        stringBuilder = new StringBuilder();
        for(Bid op : v){
            stringBuilder.append(op.getInitialBid().intValue()+",");
        }
        System.out.println(stringBuilder.toString());
    }

    public static void populate(Vector vector){
        Bid bid;
        Random randomGenerator = new Random();
        for(int i=0 ; i<10; i++){
            bid=new Bid("bid"+i,new BigDecimal(randomGenerator.nextInt(100)));
            vector.add(bid);
        }
    }
}
