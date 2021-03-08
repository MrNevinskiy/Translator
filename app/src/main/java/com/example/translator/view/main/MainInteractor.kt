package com.example.translator.view.main

import com.example.model.data.AppState
import com.example.model.data.DataModel
import com.example.repository.repository.Repository
import com.example.repository.repository.RepositoryLocal
import com.example.core.viewmodel.Interactor

class MainInteractor(
    private val repositoryRemote: Repository<List<com.example.model.data.DataModel>>,
    private val repositoryLocal: RepositoryLocal<List<com.example.model.data.DataModel>>
) : Interactor<com.example.model.data.AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): com.example.model.data.AppState {
        val appState: com.example.model.data.AppState
        if (fromRemoteSource) {
            appState = com.example.model.data.AppState.Success(repositoryRemote.getData(word))
            repositoryLocal.saveToDB(appState)
        } else {
            appState = com.example.model.data.AppState.Success(repositoryLocal.getData(word))
        }
        return appState
    }
}