package com.example.liao.modulea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_activity_main);
    }

    public void jumpModuleB(View view) {
        Toast.makeText(this, "bb", Toast.LENGTH_SHORT).show();
        try {
            Class aClass = Class.forName("com.example.liao.moduleb.MainActivity");
            Intent intent = new Intent(MainActivity.this, aClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.e("module_demo","error");
        }
    }
}
