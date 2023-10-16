package com.example.daily.di


import android.content.Context
import androidx.room.Room
import com.example.daily.model.AppDatabase
import com.example.daily.model.DailyEntry
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule(private val context: Context) {
    @Provides
    fun provideDatabase(): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "daily_journal_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideDailyEntryDao(database: AppDatabase): DailyEntryDao {
        return database.dailyEntryDao()
    }
}