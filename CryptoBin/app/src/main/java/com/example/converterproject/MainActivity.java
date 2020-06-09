package com.example.converterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button enc,dec,abt;
    ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        enc=findViewById(R.id.encd);
        dec=findViewById(R.id.decd);
        abt=findViewById(R.id.abut);

        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(MainActivity.this,encoder.class);
                startActivity(temp);
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(MainActivity.this,decoder.class);
                startActivity(temp);
            }
        });

        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp = new Intent(MainActivity.this,about.class);
                startActivity(temp);
            }
        });


        //Code of slideshow starts
        vf=findViewById(R.id.vf);

        //paste the photos in drawable. Add them to this image array with format R.drawable.filename
        int images[] = {R.drawable.bellaso_cipher, R.drawable.caesar_cipher_encryption, R.drawable.dorabella_cipher, R.drawable.skytale, R.drawable.the_ave_maria_code, R.drawable.the_voynich_manuscript};

        for(int i=0;i<images.length;i++){
            flipper(images[i]);
        }
        //Code of slideshow starts

    }

    public void flipper(int images){
        ImageView test = new ImageView(this);
        test.setBackgroundResource(images);

        vf.addView(test);
        vf.setFlipInterval(3000);
        vf.setAutoStart(true);

        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}
