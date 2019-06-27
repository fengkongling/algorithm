package com.flt.refactor;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental){
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement(){
        Enumeration rentals = this.rentals.elements();
        String result = "";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + each.getCharge();
        }
        result += String.valueOf(getTotalCharge());
        result += String.valueOf(getTotalFrequentRenterPoints());
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private double amountFor(Rental each) {
        return each.getCharge();
    }
}
