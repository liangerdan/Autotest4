package com.course.testng.Suite;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.omg.CORBA.ARG_OUT;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//SuiteConfig里面写的是公共的配置，公共的方法
public class SuiteConfig {

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
