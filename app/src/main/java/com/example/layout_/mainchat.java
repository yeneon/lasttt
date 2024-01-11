package com.example.layout_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class mainchat extends AppCompatActivity {

ListView lsvchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainchat);
        lsvchat= findViewById(R.id.lsvchat);
        ArrayList<chat> arr= new ArrayList<>();

        Random r = new Random();

        arr.add(new chat(R.drawable.sat,"Hey, are you okay there?", "Nurul"));
        arr.add(new chat(R.drawable.dul,"Are you home now?", "Min"));
        arr.add(new chat(R.drawable.tig,"Do you know about her?", "Ika"));
        arr.add(new chat(R.drawable.pat,"imy, careful babe.", "A word"));
        arr.add(new chat(R.drawable.ma,"i sent sumn money t ya", "Ibu"));
        arr.add(new chat(R.drawable.nem,"do you think i understand it?", "Dio"));
        arr.add(new chat(R.drawable.tjh,"im omw now", "Ka"));
        arr.add(new chat(R.drawable.pan,"Let's talk and meet somewhere.", "beast"));
        arr.add(new chat(R.drawable.lan,"i left my jacket in your car", "big bro"));

        chatadapter chatadapter = new chatadapter(this, 0, arr);
        lsvchat.setAdapter(chatadapter);

    }
}