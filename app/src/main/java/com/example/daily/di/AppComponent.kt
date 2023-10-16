package com.example.daily.di


import dagger.Component

@Component(modules = [DatabaseModule::class])
interface AppComponent {
    // Методы для предоставления зависимостей
}