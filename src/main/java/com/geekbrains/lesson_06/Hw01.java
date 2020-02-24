package com.geekbrains.lesson_06;


import org.hamcrest.CoreMatchers;
import org.hamcrest.CoreMatchers.*;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.Arrays;

class Hw01 {

    static int[] leftAfterLast(int after, int[] array){
        Integer last = null;

        for (int i=0;i<array.length;i++) {
            if(array[i]==after){
                last=i+1;
            }
        }
        try {
            last.equals(null);
        }catch (NullPointerException e){
            throw new RuntimeException("\""+after+"\" not found");
        }
        if(last==array.length)return new int[0];
        int[] out=new int[array.length-last];
        System.arraycopy(array,last,out,0,array.length-last);
       return out;
    }

    static boolean containsNumber(int[] array,int...cont){
        for (int i:array) {
            boolean b=false;
            for (int c:cont) {
                if (i == c) {
                    b = true;
                    break;
                }
            }
        if(!b)return false;
        }
        return true;
    }
}
