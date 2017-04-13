package ulyne.com.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by fanwei on 2017/4/13.
 */

public class DynamicBR extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("动态", "注册");
    }
}
