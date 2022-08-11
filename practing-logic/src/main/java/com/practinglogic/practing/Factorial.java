package com.practinglogic.practing;

public class Factorial {

    public double calculateFactorial(double number){
        double y = number;

        if(number<0){
            System.out.println("This can't be calculate, 'cause you've provided a negative number");
            return 0;
        } else{
            while(number>1){
                y = y*(number-1);
                number--;
            }
            System.out.println("The result is: " + y);
            return y;
        }
    }
}
