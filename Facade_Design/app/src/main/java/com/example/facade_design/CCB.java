package com.example.facade_design;

public class CCB implements CCC{
    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void AA() {
        System.out.println("AA");
    }
    @Override
    public void C(){
        System.out.println("C");
    }
}
