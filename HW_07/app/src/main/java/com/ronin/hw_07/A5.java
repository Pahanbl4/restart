package com.ronin.hw_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a5);
    }
    public void start_MainActivity(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
