package com.example.layout_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView profileimage= findViewById(R.id.prfl);
        profileimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home.this, profil.class);
                startActivity(intent);
            }
        });

        ImageView settingimage= findViewById(R.id.img1);
        settingimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home.this, seting.class);
                startActivity(intent);
            }
        });

        ImageView chatimg= findViewById(R.id.msg);
        settingimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home.this, chat.class);
                startActivity(intent);
            }
        });
    }


}