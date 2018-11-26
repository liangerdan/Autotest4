package com.course.testng;

import org.testng.annotations.Test;

//忽略测试
public class IgnoreTest {

    @Test(enabled = false)
    public void ignore1(){
        System.out.println("ignore1");
    }

    @Test
    public  void  ignore2(){
        System.out.println("ignore2");
    }

    @Test(enabled = true)
    public void  ignore3(){
        System.out.println("ignore3");
    }
}
