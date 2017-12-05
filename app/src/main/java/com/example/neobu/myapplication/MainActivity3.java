package com.example.neobu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity3 extends AppCompatActivity {
    private WebView mwebView;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mwebView = (WebView) findViewById(R.id.webview);
        mwebView.getSettings().setJavaScriptEnabled(true);
        mwebView.loadUrl("http://hywoman.ac.kr");
        mwebView.setWebViewClient(new WebViewClientClass());
    }

    private class WebViewClientClass extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
