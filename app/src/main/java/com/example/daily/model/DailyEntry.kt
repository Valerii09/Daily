package com.example.daily.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Класс, представляющий сущность (Entity) DailyEntry в базе данных.
 * Этот класс описывает структуру записи журнала, включая уникальный идентификатор, дату и текстовое содержание.
 *
 * @param id Уникальный идентификатор записи. Автоматически генерируется при вставке.
 * @param date Дата записи.
 * @param text Текстовое содержание записи.
 */
@Entity
data class DailyEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0, // Автоматически генерируемый айди
    val date: String,
    val text: String
)
