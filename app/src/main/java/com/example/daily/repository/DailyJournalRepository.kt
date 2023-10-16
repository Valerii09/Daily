package com.example.daily.repository

import com.example.daily.model.DailyEntry

interface DailyJournalRepository {
    suspend fun getAllEntries(): List<DailyEntry>
    suspend fun addEntry(entry: DailyEntry)
}