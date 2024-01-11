package com.example.layout_;

public class chat {

    public String chatName;

    public int image;

    public String contain;

    public chat(int image, String contain, String chatName) {
        this.image = image;
        this.contain = contain;
        this.chatName = chatName;
    }

    public String getChatName() {
        return chatName; // ganti pemanggill variabel menjadi chatname}

    }
}