package com.example.daily.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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

@Composable
fun AddEntryScreen(navController: NavController) {
    var date by remember { mutableStateOf("") }
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = { Text("Добавить запись") },
            backgroundColor = MaterialTheme.colors.primary
        )
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
        Button(
            onClick = {
                // Сохранить запись в базу данных
                // Переход обратно к экрану списка записей
                // navController.popBackStack()
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Сохранить")
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