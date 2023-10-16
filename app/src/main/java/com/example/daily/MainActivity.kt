package com.example.daily

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.daily.model.DailyEntry
import com.example.daily.ui.screens.AddEntryScreen
import com.example.daily.ui.screens.ListScreen
import com.example.daily.ui.theme.DailyTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyTheme {
                // Создайте NavHost и предоставьте navController
                val navController = rememberNavController()
                this@MainActivity.navController = navController

                val yourListOfEntries = listOf(
                    DailyEntry(date = "2023-10-16", text = "Сегодня был хороший день."),
                    DailyEntry(date = "2023-10-15", text = "Завершил важный проект."),
                    // Добавьте другие записи
                )

                NavHost(
                    navController = navController,
                    startDestination = "list" // Указывайте начальный экран
                ) {
                    composable("list") {
                        ListScreen(navController = navController, entries = yourListOfEntries)
                    }
                    composable("add_entry") {
                        AddEntryScreen(navController = navController)
                    }
                }
            }
        }
    }
}
