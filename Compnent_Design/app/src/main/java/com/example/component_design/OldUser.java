package com.example.component_design;

public class OldUser extends  User{
    OldUser(){
        super();
        System.out.println("这里是OldUser（）");
    }
    @Override
    protected void Add(AbsComnpent c) {

    }

    @Override
    protected void Delete(AbsComnpent c) {

    }

    @Override
    protected void Modefy(AbsComnpent c) {

    }

    @Override
    protected void Query(int id) {
        if(id ==2){
            System.out.println("该用户是老用户");
        }else{
            System.out.println("该用户不是老用户");
        }
    }
}
