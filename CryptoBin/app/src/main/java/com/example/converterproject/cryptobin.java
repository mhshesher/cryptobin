package com.example.converterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class cryptobin extends AppCompatActivity {

    TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryptobin);

        temp=findViewById(R.id.crptv);
        temp.setText(Html.fromHtml("<html>CryptoBin encrypts your text into a binary code. Instead of traditional encryption rules, it follow it's own rule.<br><br>" +
                "It also can decrypt an encrypted binary code into a human understandable text. But that encryption must be done by CryptoBin.</html>"));
    }
}
