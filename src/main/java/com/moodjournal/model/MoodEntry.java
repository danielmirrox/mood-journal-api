package com.moodjournal.model;

import java.time.LocalDate;
import java.util.UUID;

public class MoodEntry {
    private final UUID id;
    private LocalDate date;
    private Mood mood;
    private String note;

    public MoodEntry() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
