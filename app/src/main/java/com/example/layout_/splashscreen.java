package com.example.layout_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {
    private static final int SPLASH_DISPLAY_LENGTH = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent untuk berpindah ke MainActivity (atau halaman tujuan anda)
                Intent mainIntent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(mainIntent);
                finish(); //Menutup activity ini
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}