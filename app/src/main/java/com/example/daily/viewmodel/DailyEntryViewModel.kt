package com.example.daily.viewmodel

import androidx.lifecycle.ViewModel
import com.example.daily.model.DailyEntry
import com.example.daily.repository.DailyEntryRepository

class DailyEntryViewModel(private val repository: DailyEntryRepository) : ViewModel() {
    suspend fun addEntry(entry: DailyEntry) {
        repository.insertEntry(entry)
    }

    suspend fun getAllEntries(): List<DailyEntry> {
        return repository.getAllEntries()
    }
}