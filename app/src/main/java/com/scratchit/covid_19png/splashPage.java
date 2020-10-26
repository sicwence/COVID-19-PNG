package com.scratchit.covid_19png;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashPage extends AppCompatActivity {

    private static int Splash_time=4000; //time in milli-seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashPage.this,MainActivity.class);
                startActivity(intent);
            }
        }, Splash_time);

    }
}
