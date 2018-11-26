package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

/*
什么时候进行异常测试？
在我们期望结果为一个异常时候
比如说我们输入一个不合法的参数，程序抛出了异常
也就是说我的预期结果就是这个异常
 */

// 这是一个测试结果会失败的异常测试
@Test(expectedExceptions = RuntimeException.class)
public void runTimeExceptionFailed(){
    System.out.println("这是一个异常测试");
}

//这是一个测试结果会成功的异常测试
@Test(expectedExceptions = RuntimeException.class)
public void runTimeExceptionSuccess(){
    System.out.println("这是一个异常测试");
    throw new RuntimeException();
}

}


