package com.practinglogic;

import com.practinglogic.practing.Factorial;
import com.practinglogic.practing.WeekDays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PractingLogicTest {

    Factorial factorial = new Factorial();
    WeekDays weekDays = new WeekDays();

    @Test
    public void calculateFactorialTest(){
        double expectedValue = 120;
        double receivedValue = factorial.calculateFactorial(5);

        Assertions.assertEquals(expectedValue, receivedValue);
    }

    @Test
    public void weekDaysTest(){
        String expectedAnswer = "Number 3 corresponds to Wednesday";
        String receivedAnswer = weekDays.weekDays(3);

        Assertions.assertEquals(expectedAnswer, receivedAnswer);

    }
}
