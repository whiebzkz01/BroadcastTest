package com.whieb.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by zhukongzhen on 2017/3/3.
 */
public class LocalReceiver extends BroadcastReceiver {
    public LocalReceiver() {
        super();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"本地广播",Toast.LENGTH_SHORT).show();
    }
}
