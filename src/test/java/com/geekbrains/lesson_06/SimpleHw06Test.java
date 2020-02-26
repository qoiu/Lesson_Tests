package com.geekbrains.lesson_06;

import org.junit.Before;
import org.junit.Test;

public class SimpleHw06Test {
    private Hw01 test;
    @Before
    public void init(){
        test=new Hw01();
    }

   @Test
    public void simpleTest(){
       System.out.println(test.leftAfterLast(4,new int[]{1,2,3,4,5,6,7,4,5,6}).toString());
    }
}
