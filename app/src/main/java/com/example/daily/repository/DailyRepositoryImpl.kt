package com.example.daily.repository

import com.example.daily.model.AppDatabase
import com.example.daily.model.DailyEntry

class DailyRepositoryImpl(private val database: AppDatabase) : DailyRepository {

    override suspend fun getAllEntries(): List<DailyEntry> {
        return database.dailyEntryDao().getAllEntries()
    }

    override suspend fun addEntry(entry: DailyEntry) {
        database.dailyEntryDao().insertEntry(entry)
    }
}