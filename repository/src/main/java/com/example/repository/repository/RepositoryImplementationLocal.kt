package com.example.repository.repository

import com.example.model.data.AppState
import com.example.model.data.DataModel
import com.example.repository.datasource.DataSourceLocal

class RepositoryImplementationLocal(private val dataSource: DataSourceLocal<List<com.example.model.data.DataModel>>) :
    RepositoryLocal<List<com.example.model.data.DataModel>> {

    override suspend fun getData(word: String): List<com.example.model.data.DataModel> {
        return dataSource.getData(word)
    }

    override suspend fun saveToDB(appState: com.example.model.data.AppState) {
        dataSource.saveToDB(appState)
    }
}