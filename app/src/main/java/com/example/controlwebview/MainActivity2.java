package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wv1 = findViewById(R.id.wv1);

        String URL = getIntent().getStringExtra("SitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://"+ URL);
    }

    public void cerrar(View view) {
        finish();
    }
}