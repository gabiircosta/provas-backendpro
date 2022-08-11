package com.practinglogic;

import com.practinglogic.practing.Factorial;
import com.practinglogic.practing.MultiplicationTable;
import com.practinglogic.practing.OrderedLists;
import com.practinglogic.practing.WeekDays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PractingLogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractingLogicApplication.class, args);

		Factorial factorial = new Factorial();
		factorial.calculateFactorial(5);

		MultiplicationTable multiplicationTable = new MultiplicationTable();
		multiplicationTable.multTable(5);

		WeekDays weekDays = new WeekDays();
		System.out.println(weekDays.weekDays(2));

		OrderedLists lists = new OrderedLists();
		int [] list = {1, 19, 87, 36, 25};
		lists.ascendingOrder(list);

		String [] textList = {"Gabriela", "Olivia", "Lucas", "Rodrigues", "Ione"};
		lists.descendingOrder(textList);
	}

}
