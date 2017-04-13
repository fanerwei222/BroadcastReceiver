package ulyne.com.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by fanwei on 2017/4/13.
 */

public class SendMessageBR extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("收到：", "收到");
    }
}
