package com.example.layout_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class gethelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethelp);

        ListView listView = findViewById(R.id.listview);



        List<String> list = new ArrayList<>();
        list.add("Whatsapp");
        list.add("Telegram");
        list.add("Instagram");
        list.add("Pinterest");
        list.add("Facebook");
        list.add("Twitter");
        list.add("Youtube");
        list.add("TikTok");
        list.add("Reddit");
        list.add("Line");
        list.add("Twitch");



        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //clicked wa

                    startActivity(new Intent(gethelp.this, whatsapp.class));

                } else if (position == 1) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, telegram.class));

                } else if (position == 2) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, instagram.class));

                } else if (position == 3) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, pinterest.class));

                } else if (position == 4) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, facebook.class));

                } else if (position == 5) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, twitte.class));

                } else if (position == 6) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, youtube.class));

                } else if (position == 7) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, tiktok.class));

                } else if (position == 8) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, reddit.class));

                } else if (position == 9) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, line.class));

                } else if (position == 10) {
                    //clicked tele

                    startActivity(new Intent(gethelp.this, quora.class));

                }
            }
        });
    }
}