package com.example.facade_design;

public class Department2 {
    String name;
    Department2(String name){
        this.name = name;
    }
    public void dengji(){
        System.out.println(name + " 进行登记");
    }
    public void method2(){
        System.out.println(name + " 进行登记");
    }
}
