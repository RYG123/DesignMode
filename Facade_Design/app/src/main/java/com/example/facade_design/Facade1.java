package com.example.facade_design;

public class Facade1 {
    Department1 department1 = new Department1("部门1");
    Department2 department2 = new Department2("部门2");
    Department3 department3 = new Department3("部门3");

    public void dengji(){
        department1.dengji();
        department2.dengji();
        department3.dengji();
    }
}
