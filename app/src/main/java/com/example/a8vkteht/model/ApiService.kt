package com.example.a8vkteht.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface TodosApi {
    @GET("todos")
    suspend fun getTodos(): List<Todo>
}

object ApiService {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val todosApi: TodosApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodosApi::class.java)
    }
}
