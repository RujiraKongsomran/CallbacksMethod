package com.rujira.callbacksmethod;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements NumberCallback {
    com.rujira.callbacksmethod.GenerateNumber generateNumber;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            generateNumber = GenerateNumber.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, generateNumber)
                    .commit();
            generateNumber.callback = this;
        }

    }

    @Override
    public void callBackMethod(int number) {
        Log.d(TAG, "Random number : " + number);
    }
}
