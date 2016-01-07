package com.vicente.algorithms.basics.algoritms;

import com.vicente.algorithms.basics.algoritms.model.Bid;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by vicente on 01/08/15.
 */
public class PriorityQueueSample {

    public static void main(String[] args){
        Comparator<Bid> bidComparator = new Comparator<Bid>() {
            @Override
            public int compare(Bid newbid, Bid oldbid) {
                return newbid.getInitialBid().compareTo(oldbid.getInitialBid());
            }
        };

        PriorityBlockingQueue<Bid> bidQueue = new PriorityBlockingQueue<Bid>(10,bidComparator);
        populate(bidQueue);

        Iterator<Bid> iterator=bidQueue.iterator();
        while(iterator.hasNext()){
            Bid b =iterator.next();
            System.out.println(b.getName()+" contains value "+ b.getInitialBid());
        }

    }

    public static void populate(PriorityBlockingQueue priorityQueue){
        Bid bid;
        Random randomGenerator = new Random();
        for(int i=0 ; i<10; i++){
            bid=new Bid("bid"+i,new BigDecimal(randomGenerator.nextInt(100)));
            priorityQueue.add(bid);
        }
    }
}
