package com.ronin.vk_layouts;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void onClickFav(View v){
        TextView view = (TextView) findViewById(R.id.favtext);
        ImageView view1 = (ImageView) findViewById(R.id.favimage);
        if (a == 1) {
            view.setText("14");
            view1.setImageResource(R.drawable.ic_favorite_blue);
            a = 0;
        } else if (a == 0) {
            view.setText("13");
            view1.setImageResource(R.drawable.ic_favorite);
            a = 1;
        }

    }

}
