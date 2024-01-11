package com.example.layout_;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class chatadapter extends ArrayAdapter<chat> {
    private Context ct;
    private ArrayList<chat> arr;

    public chatadapter(@NonNull Context context, int resource, @NonNull List<chat> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertview, @NonNull ViewGroup parent) {
        if (convertview == null) {
            LayoutInflater i = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview = i.inflate(R.layout.awnitem, null);
        }

        if (arr.size() > 0) {
            chat d = arr.get(position);
            ImageView imgcht = convertview.findViewById(R.id.imgcht);
            TextView txtchatname = convertview.findViewById(R.id.txtchatname);
            TextView txtdesk = convertview.findViewById(R.id.txtcht);

            imgcht.setImageResource(d.image);
            txtchatname.setText(d.chatName);
            txtdesk.setText(d.contain);

            convertview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    chat clickedchat = arr.get(position);

                    String chatname = clickedchat.getChatName();

                    if (chatname.equalsIgnoreCase("Nurul")) {
                        Intent intent = new Intent(ct, nurul.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("Min")) {
                        Intent intent = new Intent(ct, min.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("Ika")) {
                        Intent intent = new Intent(ct, ika.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("A word")) {
                        Intent intent = new Intent(ct, aword.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("Ibu")) {
                        Intent intent = new Intent(ct, ibu.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("Dio")) {
                        Intent intent = new Intent(ct, dio.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("ka")) {
                        Intent intent = new Intent(ct, ka.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("beast")) {
                        Intent intent = new Intent(ct, beast.class);
                        ct.startActivity(intent);
                    } else if (chatname.equalsIgnoreCase("Big bro")) {
                        Intent intent = new Intent(ct, bigbro.class);
                        ct.startActivity(intent);
                    }

                }
            });
        }

        return convertview;
    }
}
