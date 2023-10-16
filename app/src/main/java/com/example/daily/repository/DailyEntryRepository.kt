package com.example.daily.repository

import com.example.daily.di.DailyEntryDao
import com.example.daily.model.DailyEntry

class DailyEntryRepository(private val dailyEntryDao: DailyEntryDao) {
    suspend fun insertEntry(entry: DailyEntry) {
        dailyEntryDao.insertEntry(entry)
    }

    suspend fun getAllEntries(): List<DailyEntry> {
        return dailyEntryDao.getAllEntries()
    }
}
