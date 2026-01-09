package com.example.petshop1;

import java.util.Date;

public class Happy extends Mood{
    public Happy() {
        super();
    }
    public Happy(Date date) {
        super(date);
    }
    @Override
    public String getMood() {
        return "Let's go to Banff!";
    }
}
