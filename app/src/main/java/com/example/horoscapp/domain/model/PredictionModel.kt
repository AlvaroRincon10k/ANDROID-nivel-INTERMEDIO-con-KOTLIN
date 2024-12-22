package com.example.horoscapp.domain.model

import com.google.gson.annotations.SerializedName

data class PredictionModel(
    var horoscope: String,
    var sign: String
)