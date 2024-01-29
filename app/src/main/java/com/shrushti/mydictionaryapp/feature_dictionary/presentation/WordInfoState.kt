package com.shrushti.mydictionaryapp.feature_dictionary.presentation

import com.shrushti.mydictionaryapp.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems : List<WordInfo> = emptyList() ,
    val isLoading : Boolean = false
)
