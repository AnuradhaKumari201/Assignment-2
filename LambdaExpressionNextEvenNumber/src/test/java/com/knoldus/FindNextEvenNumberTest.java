package com.knoldus;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class FindNextEvenNumberTest{
    @Test
    public void isMaxNumber() {
        FindNextEvenNumber obj = new FindNextEvenNumber();
        Long val = obj.lambdaexpressionApply(20000);
        Assertions.assertEquals(20002, val);
    }

    @Test
    public void TestForOddNUmber() {
        FindNextEvenNumber obj = new FindNextEvenNumber();
        Long val = obj.lambdaexpressionApply(20001);
        Assertions.assertEquals(20002, val);
    }
}