package com.practinglogic.practing;

import java.util.*;

public class OrderedLists {

    public void ascendingOrder(int [] numberList){
        Arrays.sort(numberList);
        System.out.println("Números em ordem crescente:");
        for(int number : numberList)
            System.out.println(number);
    }

    public void descendingOrder(String [] textList){
        Arrays.sort(textList, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente:");
        for(String text : textList)
            System.out.println(text);
    }

}
