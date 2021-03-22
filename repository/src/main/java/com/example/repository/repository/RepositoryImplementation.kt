package com.example.repository.repository

import com.example.model.data.dto.SearchResultDto
import com.example.model.data.userdata.DataModel
import com.example.repository.datasource.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<SearchResultDto>>) :
    Repository<List<SearchResultDto>> {

    override suspend fun getData(word: String): List<SearchResultDto> {
        return dataSource.getData(word)
    }
}