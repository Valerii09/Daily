package com.example.daily.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daily.di.DailyEntryDao

/**
 * Абстрактный класс базы данных, созданный с использованием Room.
 * Этот класс определяет структуру базы данных, включая список сущностей (entities) и версию базы данных.
 */
@Database(entities = [DailyEntry::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    /**
     * Метод для получения DAO (Data Access Object) для работы с таблицей DailyEntry в базе данных.
     *
     * @return DAO для таблицы DailyEntry.
     */
    abstract fun dailyEntryDao(): DailyEntryDao
}
