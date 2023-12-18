package com.marce.sdktest3_library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.marce.mylibrary.MySDK;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySDK mySDK = new MySDK();
        String greeting = mySDK.greet("MARCE");
        Log.d("SDKDemo", greeting);

        MySDK mySDK2 = new MySDK();
        mySDK2.showMessage(this, "Hola desde MySDK");
    }
}