package com.example.horoscapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandoCardProviderTest {

    @Test
    fun `getRandomCard should return a random card`() {
        val randomCard = RandoCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }

}