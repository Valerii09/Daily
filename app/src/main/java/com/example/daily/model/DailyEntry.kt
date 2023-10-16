package com.example.daily.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DailyEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val date: String,
    val text: String
)