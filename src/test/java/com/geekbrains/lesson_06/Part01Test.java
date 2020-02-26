package com.geekbrains.lesson_06;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Part01Test {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{5,6,7,8}},
                {new int[]{5, 6, 3, 2, 5}, new int[]{5,6,7,8}},
                {new int[]{3, 7, 4, 5, 8, 9},new  int[]{5,6,7,8}},
                {new int[]{4,12,23,6,9,0},new  int[]{5,6,7,8}},
                {new int[]{1, 2, 2, 2, 3, 4, 5,4},new  int[]{5,6,7,8}}
        });
    }
    private int[] arr,result;
    private Hw01 test;

    public Part01Test(int[] arr, int[] result) {
        this.arr = arr;
        this.result=result;
    }

    @Before
            public void init(){
        test=new Hw01();
    }

    @Test(expected = RuntimeException.class)
    public void testForException(){
        int[] i=test.leftAfterLast(4,arr);
    }
    @Test
    public void testDz01(){
        Assert.assertArrayEquals(result,test.leftAfterLast(4,arr));
    }

}
