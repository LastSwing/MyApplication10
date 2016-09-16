package com.example.administrator.myapplication10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String dataStr = intent.getStringExtra("data");
        tv_data = (TextView)findViewById(R.id.tv_showData);
        tv_data.setText(dataStr);

    }
}