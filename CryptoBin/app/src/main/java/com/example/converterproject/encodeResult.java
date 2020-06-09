package com.example.converterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class encodeResult extends AppCompatActivity {

    TextView tvencres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode_result);

        tvencres=findViewById(R.id.tvencres);
    }
}
