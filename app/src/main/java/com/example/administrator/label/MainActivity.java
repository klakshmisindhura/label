package com.example.administrator.label;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textview);
        WebView webView=findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override

            public boolean shouldOverrideUrlLoading(WebView view, String url){

                view.loadUrl(url);
                return true;
            }

            @Override

            public void onPageFinished(WebView view,final String url){
                super.onPageFinished(view, url);
                final TextView textView=findViewById(R.id.textview);
                textView.setText(url);
            }


        });

        webView.loadUrl("https://www.google.com");


    }
}
