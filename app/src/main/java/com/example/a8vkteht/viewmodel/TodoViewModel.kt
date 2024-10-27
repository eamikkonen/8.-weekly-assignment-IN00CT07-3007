package com.example.a8vkteht.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.a8vkteht.model.ApiService
import com.example.a8vkteht.model.Todo

class TodoViewModel : ViewModel() {
    val todos = mutableStateListOf<String>()

    init {
        fetchTodos()
    }

    private fun fetchTodos() {
        viewModelScope.launch {
            try {
                val todoList = ApiService.todosApi.getTodos()
                todos.clear()
                todos.addAll(todoList.map { it.title })
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
