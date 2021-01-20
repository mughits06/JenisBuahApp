package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ActivityWebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        //Note  : !!!
        //WebView Adalah
        //ActivityWebView adalah suatu widget di android yang memungkinkan pengagguna mengload suatu halaman web di aplikasi

        webView = findViewById(R.id.web);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://mail.google.com/mail/u/0/#inbox");

        //hanti manfaatbuah.html sesuai dgn nama html yang anda masukan
        webView.loadUrl("file:///android_asset/PISANG.html");

        setContentView(webView);

    }

}
