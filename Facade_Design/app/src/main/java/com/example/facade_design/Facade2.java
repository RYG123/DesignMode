package com.example.facade_design;

public class Facade2 {
    Department1 department1 ;
    Department2 department2;
    Department3 department3;

    Facade2(String department){
        if(department == "部门1")department1 = new Department1("部门1");
        else if(department == "部门1")department1 = new Department1("部门1");
        else if(department == "部门1")department1 = new Department1("部门1");
    }

//    public void dengji(Department1 department1){
//        department1.dengji();
//    }
//    public void dengji(Department2 department1){
//        department1.dengji();
//    }
//    public void dengji(Department3 department1){
//        department1.dengji();
//    }

    public void dengji(){
        if(department1 != null){
            department1.dengji();
        }else if(department2 != null){
            department2.dengji();
        }else if(department3 != null){
            department3.dengji();
        }
    }
}
