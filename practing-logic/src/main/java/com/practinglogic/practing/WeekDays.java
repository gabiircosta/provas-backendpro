package com.practinglogic.practing;

public class WeekDays {

    public String weekDays(int number){
        if (number == 1) {
            return "Number 1 corresponds to Monday";
        } else if(number == 2){
            return "Number 2 corresponds to Tuesday";
        } else if(number == 3){
            return "Number 3 corresponds to Wednesday";
        } else if(number == 4){
            return "Number 4 corresponds to Thursday";
        } else if(number == 5){
            return "Number 5 corresponds to Friday";
        } else if(number == 6){
            return "Number 6 corresponds to Saturday";
        } else if(number == 7){
            return "Number 7 corresponds to Sunday";
        } else
            return "This number can't be related to any week day";
    }
}
