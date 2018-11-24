package com.course.testng;


import org.testng.annotations.*;

import java.rmi.server.ServerNotActiveException;

public class BasicAnnotation {
   //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

        @BeforeMethod
        public void beforeMethod(){
        System.out.println("beforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是在测试方法之后运行的");
    }
     @BeforeClass
    public void beforClass(){
        System.out.println("beforeClass这是在类之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类之后运行的");

    }
        @BeforeSuite
        public void beforeSuit(){
        System.out.println("befourSuit测试套件");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit测试套件");
    }


}
