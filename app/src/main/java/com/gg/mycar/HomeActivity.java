package com.gg.mycar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by User on 11/3/2559.
 */


public class HomeActivity extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
    }

}