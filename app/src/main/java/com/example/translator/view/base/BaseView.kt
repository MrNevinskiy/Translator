package com.example.translator.view.base

import com.example.translator.model.data.AppState

interface BaseView {

    fun renderData(appState: AppState)

}