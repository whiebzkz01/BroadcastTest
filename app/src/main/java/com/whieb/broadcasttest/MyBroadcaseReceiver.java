package com.whieb.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcaseReceiver extends BroadcastReceiver {
    public MyBroadcaseReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context,"已收到自定义广播",Toast.LENGTH_SHORT).show();
    }
}
