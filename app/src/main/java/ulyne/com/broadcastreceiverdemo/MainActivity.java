package ulyne.com.broadcastreceiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 静态注册
         */
        Intent sendMes = new Intent("send_message");
        sendBroadcast(sendMes);

        /**
         * 动态注册
         */
        DynamicBR dynamicBR = new DynamicBR();
        IntentFilter filter = new IntentFilter();
        filter.addAction("send_message_dynamic");
        registerReceiver(dynamicBR, filter);

        Intent sendMesDynamic = new Intent("send_message_dynamic");
        sendBroadcast(sendMesDynamic);
    }
}
