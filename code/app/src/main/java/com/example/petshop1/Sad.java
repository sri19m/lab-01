package com.example.petshop1;

import java.util.Date;

public class Sad extends Mood {
    public Sad() {
        super();
    }
    public Sad(Date date) {
        super(date);
    }
    @Override
    public String getMood() {
        return "Let's go to Bar!";
    }
}
