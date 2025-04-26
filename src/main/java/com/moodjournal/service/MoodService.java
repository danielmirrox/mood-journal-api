package com.moodjournal.service;

import com.moodjournal.model.Mood;
import com.moodjournal.model.MoodEntry;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class MoodService {
    private final Map<UUID, MoodEntry> moodEntries = new HashMap<>();

    public List<MoodEntry> getAll() {
        return new ArrayList<>(moodEntries.values());
    }

    public MoodEntry addEntry(MoodEntry entry) {
        moodEntries.put(entry.getId(), entry);
        return entry;
    }

    public void deleteEntry(UUID id) {
        moodEntries.remove(id);
    }

    public List<MoodEntry> filterByDate(LocalDate date) {
        return moodEntries.values().stream()
                .filter(e -> date.equals(e.getDate()))
                .collect(Collectors.toList());
    }

    public List<MoodEntry> filterByMood(Mood mood) {
        return moodEntries.values().stream()
                .filter(e -> mood.equals(e.getMood()))
                .collect(Collectors.toList());
    }
}
