package com.example.a8vkteht.uInterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.a8vkteht.viewmodel.TodoViewModel
import com.example.a8vkteht.uInterface.TodoScreen

class MainActivity : ComponentActivity() {
    private val todoViewModel: TodoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoScreen(todos = todoViewModel.todos)
        }
    }
}
