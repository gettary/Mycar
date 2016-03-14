package com.gg.mycar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 11/3/2559.
 */


public class HomeActivity extends Activity implements View.OnClickListener {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
    }



    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.lock_button: {
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage("+66891053596", null, "lock", null, null);
                    break;
                }

                case R.id.unlock_button: {
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage("+66891053596", null, "unlock", null, null);
                    break;
                }
                case R.id.location_button: {
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage("+66891053596", null, "location", null, null);

                    Intent intent = new Intent(LoginActivity.this, MapsActivity.class);
                    startActivity(intent);

                    break;
                }

            }
    }

}