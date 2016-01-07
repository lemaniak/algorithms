package com.vicente.algorithms.basics.algoritms.model;

import java.math.BigDecimal;

/**
 * Created by vicente on 01/08/15.
 */
public class Bid {

    private String name;
    private BigDecimal initialBid;

    public Bid(String name, BigDecimal initialBid) {
        this.name = name;
        this.initialBid = initialBid;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getInitialBid() {
        return initialBid;
    }

}
