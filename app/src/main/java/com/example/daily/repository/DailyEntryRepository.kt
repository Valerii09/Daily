package com.example.daily.repository

import com.example.daily.di.DailyEntryDao
import com.example.daily.model.DailyEntry

/**
 * Репозиторий, отвечающий за взаимодействие с записями журнала (DailyEntry) в базе данных.
 * Этот класс предоставляет методы для вставки новых записей и получения списка всех записей из базы данных.
 *
 * @param dailyEntryDao DAO для работы с таблицей DailyEntry в базе данных.
 */
class DailyEntryRepository(private val dailyEntryDao: DailyEntryDao) {
    /**
     * Метод для вставки новой записи журнала в базу данных.
     *
     * @param entry Новая запись, которую необходимо вставить.
     */
    suspend fun insertEntry(entry: DailyEntry) {
        dailyEntryDao.insertEntry(entry)
    }

    /**
     * Метод для получения списка всех записей журнала из базы данных.
     *
     * @return Список всех записей журнала.
     */
    suspend fun getAllEntries(): List<DailyEntry> {
        return dailyEntryDao.getAllEntries()
    }
}
