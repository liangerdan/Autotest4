package com.course.testng.Paramter;


import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "Data")
    public  void testDataProvider(String name,int age){
        System.out.println("name:"+name+";age:"+age);
    }

    @DataProvider(name = "Data")
    public Object[][] providerData(){

        Object[][] o = new Object[][]{
                {"zhangsan",1},
                {"lisi",2}
        };
        return  o;
    }


    @Test(dataProvider = "methodData")
    public  void  test1(String name,int age){
        System.out.println("test1方法name:"+name+";test1方法age:"+age);
    }

    @Test(dataProvider = "methodData")
    public  void  test2(String name,int age){
        System.out.println("test2方法name:"+name+";test2方法age:"+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodData(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
          result = new   Object[][] {
                  {"zhangsan",5},
                  {"lisi",6}
          };

        }else if(method.getName().equals("test2")){

            result = new  Object[][]{
                    {"wangwu",10},
                    {"liuliu",11}
            };
        };
        return  result;

}
}




