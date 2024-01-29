package com.shrushti.mydictionaryapp.feature_dictionary.domain.model

import com.shrushti.mydictionaryapp.feature_dictionary.data.remote.dto.MeaningDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)
