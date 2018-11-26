package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class multiThreadTest {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void  test(){
        System.out.println(1);
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());
    }
}
