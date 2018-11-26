package com.course.testng.Suite;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.omg.CORBA.ARG_OUT;
import org.testng.annotations.*;

//SuiteConfig里面写的是公共的配置，公共的方法
public class SuiteConfig {


//    @BeforeMethod
//    public void beforeClass(){
//        System.out.println("beforemethod");
//    }
//
//    @AfterMethod
//    public void afterClass(){
//        System.out.println("aftermethod");
//    }
    //为什么加了这段运行没有结果，befourMether\befourClass都只能在有test注解下使用

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("after suite运行啦");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

}
