@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.a8vkteht.uInterface

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TodoScreen(todos: List<String>) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Todo List") })
        }
    ) { paddingValues ->
        // Apply the padding parameter to the content
        TodoList(todos, modifier = Modifier.padding(paddingValues))
    }
}

@Composable
fun TodoList(todos: List<String>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(todos) { todo ->
            Text(text = todo)
        }
    }
}
