package com.example.horoscapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.horoscapp.domain.model.PredictionModel
import com.example.horoscapp.domain.usecase.GetPredictionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPredictionUseCase: GetPredictionUseCase) : ViewModel() {

    private var _state = MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading)
    val state: StateFlow<HoroscopeDetailState> = _state

    fun getHoroscope(sign: String){
        _state.value = HoroscopeDetailState.Loading
        viewModelScope.launch {
            val result: PredictionModel? = withContext(Dispatchers.IO){ getPredictionUseCase(sign) }
            if(result != null){
                _state.value = HoroscopeDetailState.Success(result.horoscope, result.sign)
            } else{
                _state.value = HoroscopeDetailState.Error("Ha ocurrido un error, intentelo mas tarde")
            }
        }
    }
}