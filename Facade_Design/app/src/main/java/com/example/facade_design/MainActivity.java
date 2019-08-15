package com.example.facade_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
////测试强转类型会怎样。
//        AAAA a = new CCB();
//        a.A();
//        a.AA();
//        System.out.println("a是什么："+a);
//        ((CCB) a).C();
//        a.AA();
//        System.out.println("a是什么："+a);

        Facade1 facade1 = new Facade1();
        facade1.dengji();

        Facade2 facade2 = new Facade2("部门1");
        facade2.dengji();
    }
}
