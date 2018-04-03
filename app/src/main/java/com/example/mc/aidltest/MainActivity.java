package com.example.mc.aidltest;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btStart;
    private Button btEnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btStart=findViewById(R.id.bt_start);
        btEnd=findViewById(R.id.bt_end);
        btStart.setOnClickListener((view)-> sendBroadcast("少年开始了"));
        btEnd.setOnClickListener((view)->{
                sendBroadcast("结束了，屌丝");
        });

    }



    private void sendBroadcast(String vaule){
        String tag="com.example.mc.aidltest.progress";
        Intent intent=new Intent(tag);
        intent.putExtra("str",vaule);
        sendBroadcast(intent);
    }


}
