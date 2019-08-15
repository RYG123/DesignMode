package com.example.component_design;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsComnpent {
    protected String name ;
    protected List<AbsComnpent> list = new ArrayList<AbsComnpent>();
    AbsComnpent(String name){
        this.name = name;
    }
    protected abstract void Add(AbsComnpent c)throws Exception;
    protected abstract void Delete(AbsComnpent c)throws Exception;
    protected abstract void Modefy(AbsComnpent c)throws Exception;
    protected abstract void Query(String id);

}
