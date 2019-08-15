package com.example.component_design;

public class UserLeaf extends AbsComnpent{
    UserLeaf(String name){
        super(name);
    }

    @Override
    protected void Add(AbsComnpent c) throws Exception{
        throw new Exception("不支持的方法");
    }

    @Override
    protected void Delete(AbsComnpent c) throws Exception {
        throw new Exception("不支持的方法");
    }

    @Override
    protected void Modefy(AbsComnpent c) throws Exception {
        throw new Exception("不支持的方法");
    }

    @Override
    protected void Query(String id) {
           System.out.println(id+"/"+this.name);
    }
}
