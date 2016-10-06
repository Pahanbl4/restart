package com.ronin.hw_07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);
    }
    public void start_A5(View view){
        Intent intent=new Intent(this,A5.class);
        startActivity(intent);
    }
}
