package com.example.repository.repository

interface RepositoryLocal<T> : Repository<T> {

    suspend fun saveToDB(appState: com.example.model.data.AppState)
}