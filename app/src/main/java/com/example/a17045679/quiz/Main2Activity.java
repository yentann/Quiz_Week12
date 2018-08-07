package com.example.a17045679.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        web = findViewById(R.id.webview);

        WebSettings webSettings = web.getSettings();
        webSettings.setAllowFileAccess(false);
        webSettings.getBuiltInZoomControls();

        //Received the Intent from MainActivity
        Intent intentReceived = getIntent();
        int twitter = intentReceived.getIntExtra("twitter",0);

        String[] Rp = getResources().getStringArray(R.array.url);


    }

}
