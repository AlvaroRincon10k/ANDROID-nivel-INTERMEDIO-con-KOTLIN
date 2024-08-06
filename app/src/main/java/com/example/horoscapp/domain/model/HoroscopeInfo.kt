package com.example.horoscapp.domain.model

import com.example.horoscapp.R

sealed class HoroscopeInfo(val img: Int, val name: Int) {
    object Aries : HoroscopeInfo(R.drawable.ic_horoscope, R.string.app_name)
}
