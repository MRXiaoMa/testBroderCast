package com.example.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;

public class MyBroadCast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getStringExtra("str");
        Log.d("broadCast", str);
        EventBus.getDefault().post(str);
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
