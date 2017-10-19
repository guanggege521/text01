package com.example.myandroid3_demo01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public  class MainActivity extends AppCompatActivity {

    private TextView text_Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDate();

    }

    private void initDate() {

    }

    private void initView() {
        text_Send = (TextView) findViewById(R.id.text_Send);
    }
}
