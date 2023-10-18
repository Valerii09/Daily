package com.example.daily.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.daily.model.DailyEntry



/**
 * Composable-функция для экрана списка записей в ежедневнике.
 *
 * @param navController NavController для навигации по приложению.
 * @param entries Список записей, которые нужно отобразить.
 */
@Composable
fun ListScreen(navController: NavController, entries: List<DailyEntry>) {
    Surface(
        color = MaterialTheme.colors.background, // Цвет фона поверхности
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopAppBar(
                title = { Text("Ежедневник") },
                backgroundColor = MaterialTheme.colors.primary // Цвет верхней панели
            )
            LazyColumn {
                items(entries) { entry ->
                    EntryListItem(entry = entry) {
                        // Переход к экрану деталей записи
                        // navController.navigate("entry_detail/${entry.id}")
                    }
                }
            }
            Button(
                onClick = {
                    navController.navigate("add_entry")
                    // Переход к экрану добавления записи
                }
            ) {
                Text("Добавить запись")
            }
        }
    }
}

/**
 * Composable-функция для отображения элемента списка записей.
 *
 * @param entry Запись для отображения.
 * @param onItemClick Обработчик нажатия на элемент.
 */
@Composable
fun EntryListItem(entry: DailyEntry, onItemClick: () -> Unit) {
    // Элемент списка записей
    // Можно отобразить информацию о записи, такую как дата и текст,
    // и добавить обработчик нажатия
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onItemClick)
            .padding(16.dp)
    ) {
        Text(text = entry.date, style = MaterialTheme.typography.h6)
        Text(text = entry.text, style = MaterialTheme.typography.body1)
    }
}


@Preview
@Composable
fun ListScreenPreview() {
    val navController = rememberNavController()
    val dummyEntries = generateDummyEntries() // Замените это на ваш список записей

    MaterialTheme {
        ListScreen(navController, dummyEntries)
    }
}

@Composable
fun generateDummyEntries(): List<DailyEntry> {
    // Здесь можно создать и заполнить список фиктивными данными
    return List(10) { index ->
        DailyEntry(
            date = "Date $index",
            text = "Entry $index"
        )
    }
}