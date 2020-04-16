package com.quotesfloetik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int duree=2520;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash=new Intent(MainActivity.this, Login.class);
                startActivity(splash);
                MainActivity.super.finish();
            }
        },duree);

    }
}

