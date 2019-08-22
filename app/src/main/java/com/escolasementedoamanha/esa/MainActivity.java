package com.escolasementedoamanha.esa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView viewMRT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewMRT = findViewById(R.id.site);
        viewMRT.getSettings().setJavaScriptEnabled(true);
        viewMRT.setFocusable(true);
        viewMRT.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        viewMRT.getSettings().setAppCacheEnabled(true);
        viewMRT.getSettings().setDomStorageEnabled(true);
        viewMRT.setWebViewClient(new WebViewClient());
        viewMRT.loadUrl("https://escolasementedoamanha.com/login");

    }
}
