package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.tvWeb);
    }

    public void navegar(View view) {
        Intent i = new Intent(this , MainActivity2.class);
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }
}