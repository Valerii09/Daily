package com.example.daily.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

/**
 * Composable-функция для экрана добавления новой записи в журнал.
 *
 * @param navController NavController для навигации по приложению.
 */
@Composable
fun AddEntryScreen(navController: NavController) {
    // Состояние для хранения даты и текста записи.
    var date by remember { mutableStateOf("") }
    var text by remember { mutableStateOf("") }

    // Создание макета экрана.
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Верхняя панель приложения.
        TopAppBar(
            title = { Text("Добавить запись") },
            backgroundColor = MaterialTheme.colors.primary
        )

        // Поля ввода для даты и текста записи.
        OutlinedTextField(
            value = date,
            onValueChange = { date = it },
            label = { Text("Дата") }
        )

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Текст записи") },
            modifier = Modifier.fillMaxWidth()
        )

        // Кнопки "Сохранить" и "Отмена".
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Используйте weight и fillMaxWidth, чтобы сделать кнопки одинакового размера.
            Button(
                onClick = {
                    // Сохранить запись в базу данных.
                    // Перейти обратно к экрану списка записей.
                    navController.navigate("list")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 12.dp)
                    .weight(1f) // Равное вес для равномерного распределения
            ) {
                Text("Сохранить")
            }

            Button(
                onClick = {
                    // Отмена - перейти обратно к экрану списка записей.
                    navController.navigate("list")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f) // Равное вес для равномерного распределения
            ) {
                Text("Отмена")
            }
        }
    }
}


@Preview
@Composable
fun AddEntryScreenPreview() {
    val navController = rememberNavController()

    MaterialTheme {
        AddEntryScreen(navController)
    }
}