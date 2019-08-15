package com.example.component_design;

public class NewUser extends User{
    NewUser(){
        super();
        System.out.println("这里是NewUser（）");
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
        if(id == 1){
            System.out.println("该用户是新用户");
        }else{
            System.out.println("该用户不是新用户");
        }
    }
}
