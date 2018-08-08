package com.zh.zrz.testdenpendency;

public class Task {
    public String workApi1(){
        System.out.println("new workApi1");
        return "new workApi1";
    }

    public String workApi2(){
        System.out.println("workApi2");
        return "workApi2";
    }
}
