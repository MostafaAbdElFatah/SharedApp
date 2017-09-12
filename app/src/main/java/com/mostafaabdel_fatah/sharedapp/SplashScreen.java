package com.mostafaabdel_fatah.sharedapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent page = new Intent();
                page.setClass(getApplicationContext(), MainActivity.class);
                startActivity(page);
                finish();
            }
        }, 2000);
    }
}
