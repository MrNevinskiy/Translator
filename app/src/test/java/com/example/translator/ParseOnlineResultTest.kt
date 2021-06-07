package com.example.translator

import com.example.model.data.userdata.DataModel
import com.example.model.data.userdata.Meaning
import com.example.model.data.userdata.TranslatedMeaning
import org.junit.Test
import com.example.translator.utils.convertMeaningsToSingleString
import org.junit.Assert.*

class ParseOnlineResultTest {

    @Test
    fun convertMeaningsToSingleStringNull(){
        val dataModel: DataModel? = null
        assertNull(dataModel?.meanings?.let { convertMeaningsToSingleString(it) })
    }

    @Test
    fun convertMeaningsToSingleStringNotNull(){
        val meaning =  Meaning(TranslatedMeaning("SomeText"), "SomeText")
        val dataModel = DataModel("SomeText", meanings = listOf(meaning))
        assertNotNull(convertMeaningsToSingleString(dataModel.meanings))
    }
}