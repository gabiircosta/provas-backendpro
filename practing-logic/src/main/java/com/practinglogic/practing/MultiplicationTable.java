package com.practinglogic.practing;

public class MultiplicationTable {

    public void multTable (int number){

        if(number<0){
            System.out.println("This can't be calculate, 'cause you've provided a negative number");
        } else {

            for (int i = 0; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
