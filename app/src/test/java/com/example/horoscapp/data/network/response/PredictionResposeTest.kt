package com.example.horoscapp.data.network.response

import com.example.horoscapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResposeTest {

    @Test
    fun `toDomain should return a correct PredictionModel`() {
        //Given
        val horoscopeRespose = anyResponse

        //When
        val predictionModel = horoscopeRespose.toDomain()

        //Then
        predictionModel.sign shouldBe horoscopeRespose.sign
        predictionModel.horoscope shouldBe horoscopeRespose.horoscope

    }
}