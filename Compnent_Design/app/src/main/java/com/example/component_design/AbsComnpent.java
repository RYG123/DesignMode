package com.example.component_design;

public abstract class AbsComnpent {
    AbsComnpent(){
        System.out.println("创建一个数据库");
    }
    protected abstract void Add(AbsComnpent c);
    protected abstract void Delete(AbsComnpent c);
    protected abstract void Modefy(AbsComnpent c);
    protected abstract void Query(int id);

}
