package com.example.component_design;

public class UserLeaf extends AbsComnpent{


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
            System.out.println("这里是Leaf1的Query(),这里只展示所有UserId");
            System.out.println("有用户1");
            System.out.println("有用户2");
    }
}
