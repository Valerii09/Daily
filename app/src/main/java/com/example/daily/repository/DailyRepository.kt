package com.example.daily.repository

import com.example.daily.model.DailyEntry

interface DailyRepository {
    suspend fun getAllEntries(): List<DailyEntry>
    suspend fun addEntry(entry: DailyEntry)
}