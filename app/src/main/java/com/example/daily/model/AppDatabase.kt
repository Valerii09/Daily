package com.example.daily.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daily.di.DailyEntryDao

@Database(entities = [DailyEntry::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dailyEntryDao(): DailyEntryDao
}