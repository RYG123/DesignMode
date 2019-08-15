package com.example.facade_design;

public class Department1 {
    String name;
    Department1(String name){
        this.name = name;
    }
    public void dengji(){
        System.out.println(name + " 进行登记");
    }
    public void method1(){
        System.out.println(name + " 进行登记");
    }

}
