package com.example.daily.repository

import com.example.daily.model.DailyEntry

/**
 * Интерфейс, представляющий репозиторий для взаимодействия с записями журнала DailyEntry.
 * Этот интерфейс определяет методы для получения всех записей журнала и добавления новых записей.
 */
interface DailyRepository {
    /**
     * Метод для получения списка всех записей журнала.
     *
     * @return Список всех записей журнала.
     */
    suspend fun getAllEntries(): List<DailyEntry>

    /**
     * Метод для добавления новой записи журнала.
     *
     * @param entry Новая запись, которую необходимо добавить.
     */
    suspend fun addEntry(entry: DailyEntry)
}
