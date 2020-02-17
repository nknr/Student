package com.nk.student;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity","start: "+getClass().getName()+" taskId "+getTaskId());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity","destroy: "+getClass().getName()+" taskId "+getTaskId());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity","pause: "+getClass().getName()+" taskId "+getTaskId());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity","resume: "+getClass().getName()+" taskId "+getTaskId());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity","stop: "+getClass().getName()+" taskId "+getTaskId());
    }

}
