package com.shrushti.mydictionaryapp.feature_dictionary.domain.respository

import com.shrushti.mydictionaryapp.core.util.Resource
import com.shrushti.mydictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo (word : String) : Flow<Resource<List<WordInfo>>>
}