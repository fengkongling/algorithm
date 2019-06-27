package com.flt.refactor;

/**
 * @author: fenglingtong
 * @date: 2019/6/25
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented){
        return 1;
    }

}
