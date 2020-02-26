package com.geekbrains.lesson_06;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Part02Test {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,1,1,4,4,4}},
                {new int[]{1,1,1,1,1}},
                {new int[]{1,1,1,5}},
                {new int[]{4,12,23,6,9,0}},
                {new int[]{1, 2, 2, 2, 3, 4, 5,4}}
        });
    }
    private int[] array;
    private Hw01 test;

    @Before
    public void init(){
        test=new Hw01();
    }

    public Part02Test(int[] array) {
        this.array = array;
    }

    @Test
    public void containTest(){
       //MatcherAssert.assertThat(array, Matchers.arrayContainingInAnyOrder(1,4));
        System.out.println(test.containsNumber(array, 1,4));
        //MatcherAssert.assertThat(new Integer[]{1, 2, 3, 4}, Matchers.arrayContaining(4, 3, 1, 2));
    }

}
