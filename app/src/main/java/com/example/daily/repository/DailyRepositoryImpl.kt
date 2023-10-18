package com.example.daily.repository

import com.example.daily.model.AppDatabase
import com.example.daily.model.DailyEntry

/**
 * Реализация интерфейса DailyRepository для взаимодействия с записями журнала в базе данных.
 *
 * @param database Экземпляр базы данных, необходимый для выполнения операций с записями.
 */
class DailyRepositoryImpl(private val database: AppDatabase) : DailyRepository {

    /**
     * Метод для получения списка всех записей журнала из базы данных.
     *
     * @return Список всех записей журнала.
     */
    override suspend fun getAllEntries(): List<DailyEntry> {
        return database.dailyEntryDao().getAllEntries()
    }

    /**
     * Метод для добавления новой записи журнала в базу данных.
     *
     * @param entry Новая запись, которую необходимо добавить.
     */
    override suspend fun addEntry(entry: DailyEntry) {
        database.dailyEntryDao().insertEntry(entry)
    }
}
