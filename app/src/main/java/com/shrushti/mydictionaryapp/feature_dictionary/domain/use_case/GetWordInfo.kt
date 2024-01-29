package com.shrushti.mydictionaryapp.feature_dictionary.domain.use_case

import com.shrushti.mydictionaryapp.core.util.Resource
import com.shrushti.mydictionaryapp.feature_dictionary.domain.model.WordInfo
import com.shrushti.mydictionaryapp.feature_dictionary.domain.respository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke (word:String) : Flow<Resource<List<WordInfo>>>{
        if(word.isBlank()){
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}