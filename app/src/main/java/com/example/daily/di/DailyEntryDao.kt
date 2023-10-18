package com.example.daily.di

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.daily.model.DailyEntry

/**
 * DAO (Data Access Object) интерфейс для взаимодействия с таблицей DailyEntry в базе данных.
 * Этот интерфейс предоставляет методы для выполнения операций вставки и выборки данных из таблицы DailyEntry.
 */
@Dao
interface DailyEntryDao {
    /**
     * Метод для вставки записи DailyEntry в таблицу.
     *
     * @param entry Запись, которую необходимо вставить.
     */
    @Insert
    suspend fun insertEntry(entry: DailyEntry)

    /**
     * Метод для выборки всех записей из таблицы DailyEntry.
     *
     * @return Список всех записей в таблице DailyEntry.
     */
    @Query("SELECT * FROM DailyEntry")
    suspend fun getAllEntries(): List<DailyEntry>
}
