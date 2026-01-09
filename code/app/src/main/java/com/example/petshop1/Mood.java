package com.example.petshop1;

import java.util.Date;

public abstract class Mood {
    private Date moodDate;
    public Mood() {
        this.moodDate = new Date();
    }
    public Mood(Date date) {
        this.moodDate = date;
    }
    public Date getMoodDate() {
        return moodDate;
    }
    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }
    public abstract String getMood();
}
