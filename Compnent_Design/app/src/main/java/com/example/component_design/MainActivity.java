package com.example.component_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    AbsComnpent abcComnpent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abcComnpent = new UserLeaf();
        abcComnpent.Query(2);
    }
}
