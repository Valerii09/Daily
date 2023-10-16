package com.example.daily.di

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.daily.model.DailyEntry

@Dao
interface DailyEntryDao {
    @Insert
    suspend fun insertEntry(entry: DailyEntry)

    @Query("SELECT * FROM DailyEntry")
    suspend fun getAllEntries(): List<DailyEntry>
}