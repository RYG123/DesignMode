package com.example.component_design;

public class NewUser extends User{
    NewUser(String name){
        super(name);
    }
    @Override
    protected void Add(AbsComnpent c) {
        list.add(c);
    }

    @Override
    protected void Delete(AbsComnpent c) {
        list.remove(c);
    }

    @Override
    protected void Modefy(AbsComnpent c) {
        int i = list.indexOf(c);
        Delete(c);
        list.add(c);
    }

    @Override
    protected void Query(String id) {
       id += "/"+this.name;
       for(AbsComnpent ac : list){
           ac.Query(id);
       }

    }
}
