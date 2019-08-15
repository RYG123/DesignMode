package com.example.component_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    AbsComnpent abcComnpent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbsComnpent newUser = new NewUser("新用户数据");
        AbsComnpent oldUser = new OldUser("旧用户数据");

        AbsComnpent leaf1 = new UserLeaf("新用户1");
        AbsComnpent leaf2 = new UserLeaf("新用户2");
        AbsComnpent leaf3 = new UserLeaf("新用户3");

        AbsComnpent leaf11 = new UserLeaf("旧用户1");
        AbsComnpent leaf22 = new UserLeaf("旧用户2");
        AbsComnpent leaf33 = new UserLeaf("旧用户3");

        try {
            newUser.Add(leaf1);
            newUser.Add(leaf2);
            newUser.Add(leaf3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            oldUser.Add(leaf11);
            oldUser.Add(leaf22);
            oldUser.Add(leaf33);
        } catch (Exception e) {
            e.printStackTrace();
        }

        oldUser.Query("");
        newUser.Query("");
    }
}
