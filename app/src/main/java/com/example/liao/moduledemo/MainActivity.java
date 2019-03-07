package com.example.liao.moduledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpModuleA(View view) {
        try {
            Class aClass =Class.forName("com.example.liao.modulea.MainActivity");
            Intent intent =new Intent(MainActivity.this,aClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.e("module_demo","error");
        }

    }
}
