package com.course.testng.Suite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PayTest {

    @Test
    public void Pay(){

        System.out.println("支付宝付钱成功啦！");
    }
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("class之前");
//    }
}
