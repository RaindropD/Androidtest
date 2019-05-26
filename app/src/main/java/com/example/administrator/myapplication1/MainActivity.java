package com.example.administrator.myapplication1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hallo=findViewById(R.id.tv_hallo);
        tv_hallo.setText("这可真是个有用的软件啊！");
        tv_hallo.setTextColor(Color.RED);
        tv_hallo.setTextSize(30);
    }
}
