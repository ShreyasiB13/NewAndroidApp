package com.example.webviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           WebView webView;
           ProgressBar mProgressBar;
         webView = (WebView) findViewById(R.id.webview);
         mProgressBar =findViewById(R.id.progressBar);
         mProgressBar.setMax(100);

        webView.loadUrl("https://xd.adobe.com/view/4b7e5026-cfc1-4b07-69de-10f76bec2981-3d4f/screen/f4b00fb7-fb74-4b52-abb6-5ec10da902c1/");

        webView.loadData("<html><body><h1>Hi there!</h1><p>This is my website.</p></body></html>", "text/html", "UTF-8");
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
            }

            @Override
            public void onReceivedIcon(WebView view, Bitmap icon) {
                super.onReceivedIcon(view, icon);
            }

            public void onProgressChanged(WebView view, int newprogress) {
                super.onProgressChanged(view,newprogress);

            }





                    });
        }
}
