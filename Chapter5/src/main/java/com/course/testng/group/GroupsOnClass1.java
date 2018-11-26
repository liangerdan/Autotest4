package com.course.testng.group;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1() {
        System.out.println("stu111");
    }

        public void stu2(){
        System.out.println("stu222");


    }
}
