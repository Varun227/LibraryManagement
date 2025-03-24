package org.airtribe.fine;

public class FineCalculator {
    public static double calculateFine(int days){
        double fine = 0;
        if(days>0 && days<=5){
            fine = days*0.5;
        }else if(days>5 && days<=10){
            fine = days*1;
        }else if(days>10 && days<=30){
            fine = days*5;
        }else if(days>30){
            fine = days*10;
        }
        return fine;
    }
}
