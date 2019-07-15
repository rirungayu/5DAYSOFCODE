package com.example.android.a5daysofcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AboutALC extends AppCompatActivity {
private WebView aboutalc = findViewById(R.id.webview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        aboutalc.loadUrl("https://andela.com/alc/");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About ALC");
    }



}
