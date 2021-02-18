package com.example.translator.presenter

import com.example.translator.model.data.AppState
import com.example.translator.view.base.BaseView

interface Presenter<T : AppState, V : BaseView> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}