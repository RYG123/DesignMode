package com.example.facade_design;

public class Department3 {
    String name;
    Department3(String name){
        this.name = name;
    }
    public void dengji(){
        System.out.println(name + " 进行登记");
    }
    public void method3(){
        System.out.println(name + " 进行登记");
    }
}
