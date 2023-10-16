package com.example.daily.viewmodel

import androidx.lifecycle.ViewModel
import com.example.daily.model.DailyEntry
import com.example.daily.repository.DailyEntryRepository

class DailyEntryViewModel(private val repository: DailyEntryRepository) : ViewModel() {
    // Методы для получения и сохранения записей в ежедневнике
}