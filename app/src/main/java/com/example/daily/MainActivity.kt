package com.example.daily

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.daily.model.DailyEntry
import com.example.daily.ui.screens.ListScreen
import com.example.daily.ui.theme.DailyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyTheme {
                val yourListOfEntries = listOf(
                    DailyEntry(date = "2023-10-16", text = "Сегодня был хороший день."),
                    DailyEntry(date = "2023-10-15", text = "Завершил важный проект."),
                    // Добавьте другие записи
                )

                ListScreen(navController = rememberNavController(), entries = yourListOfEntries)
            }
        }
    }
}
