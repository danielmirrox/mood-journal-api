package com.moodjournal.controller;

import com.moodjournal.model.Mood;
import com.moodjournal.model.MoodEntry;
import com.moodjournal.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/moods")
public class MoodController {

    @Autowired
    private MoodService moodService;

    @GetMapping
    public List<MoodEntry> getAll(@RequestParam(required = false) String date,
                                  @RequestParam(required = false) Mood mood) {
        if (date != null) {
            return moodService.filterByDate(LocalDate.parse(date));
        }
        if (mood != null) {
            return moodService.filterByMood(mood);
        }
        return moodService.getAll();
    }

    @PostMapping
    public MoodEntry create(@RequestBody MoodEntry entry) {
        return moodService.addEntry(entry);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        moodService.deleteEntry(id);
    }
}
