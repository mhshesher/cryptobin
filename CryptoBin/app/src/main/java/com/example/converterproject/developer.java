package com.example.converterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
    }

    public void gmail(View view) {
        Intent temp = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:mehedi15-9804@diu.edu.bd"));
        startActivity(temp);
    }

    public void lnkd(View view) {
        Intent temp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/mehedi-hasan-590318161/"));
        startActivity(temp);
    }

    public void gsite(View view) {
        Intent temp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/diu.edu.bd/mhshesher/home"));
        startActivity(temp);
    }
}
