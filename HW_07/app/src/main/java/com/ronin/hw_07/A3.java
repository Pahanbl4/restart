package com.ronin.hw_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
    }
    public void start_A4(View view){
        Intent intent=new Intent(this,A4.class);
        startActivity(intent);
    }
}
