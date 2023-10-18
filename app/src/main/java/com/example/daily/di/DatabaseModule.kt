package com.example.daily.di


import android.content.Context
import androidx.room.Room
import com.example.daily.model.AppDatabase
import com.example.daily.model.DailyEntry
import dagger.Module
import dagger.Provides

/**
 * Модуль Dagger для предоставления зависимостей, связанных с базой данных.
 * Этот модуль предоставляет экземпляр базы данных (AppDatabase) и DAO (Data Access Object) для работы с таблицей DailyEntry.
 *
 * @param context Контекст приложения, необходим для настройки базы данных.
 */
@Module
class DatabaseModule(private val context: Context) {
    /**
     * Метод, предоставляющий экземпляр базы данных (AppDatabase).
     *
     * @return Экземпляр базы данных для приложения.
     */
    @Provides
    fun provideDatabase(): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "daily_journal_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    /**
     * Метод, предоставляющий DAO (Data Access Object) для работы с таблицей DailyEntry.
     *
     * @param database Экземпляр базы данных, из которого будет получен DAO.
     * @return DAO для таблицы DailyEntry.
     */
    @Provides
    fun provideDailyEntryDao(database: AppDatabase): DailyEntryDao {
        return database.dailyEntryDao()
    }
}
