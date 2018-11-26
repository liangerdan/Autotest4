package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

//方法分组测试
public class GroupTest {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法4444");
    }


    @BeforeGroups("server")
    public void  beforeGroupsOnServer(){
        System.out.println("这是服务端运行之前的方法");
    }

    @AfterGroups("server")
    public  void  afterGroupsOnServer(){
        System.out.println("这是服务端运行之后的方法");
    }

    @BeforeGroups("client")
    public void  beforeGroupsOnClient(){
        System.out.println("这是服务端运行之前的方法");
    }

    @AfterGroups("client")
    public  void  afterGroupsOnClient(){
        System.out.println("这是服务端运行之后的方法");
    }

}
