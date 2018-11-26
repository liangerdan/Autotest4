package com.course.testng;

import org.testng.annotations.Test;

public class ThreadTimeOut {

    @Test(timeOut = 3000)//期望3000毫秒
    public void timeOutSuccess() throws InterruptedException {
       Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public  void timeOutFailed() throws InterruptedException {
        Thread.sleep(3000);

    }

}
