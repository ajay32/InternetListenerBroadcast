package com.example.macmine.internetlistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NetworkChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {

        int status = NetworkUtil.getConnectivityStatusString(context);
        Log.e("ajaymehta", ""+status); //0 and1 .. 0 not connect wifi ..2 mobile
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if(status==NetworkUtil.NETWORK_STATUS_NOT_CONNECTED){
                Log.e("ajaymehta","state not connected");

            }else {

                Log.e("ajaymehta","state connected");
            }

       }
    }
}