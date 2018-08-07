package com.example.a17045679.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        web = findViewById(R.id.webview);

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(false);
        webSettings.getBuiltInZoomControls();

        web.setWebViewClient(new WebViewClient());



        //the Spinner1 (even and odd) numbers
        ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.socialmedia));
        spinnerArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter1);


        //Auto update the both Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                switch (i) {
                    case 0:
                        //Your code for item 1 selected
                        //Get the string-array and store as an Array
                        final String[] strNumbers = getResources().getStringArray(R.array.url);
                        String url = "https://www.twitter.com";
                        web.loadUrl(url);

                        break;
                    case 1:
                        //Your code for item 2 selected
                        //Get the string-array and store as an Array
                        final String[] strNumbers1 = getResources().getStringArray(R.array.url);
                        String url1 = "https://www.facebook.com";
                        web.loadUrl(url1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}



