package com.dbarad.composebase.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dbarad.composebase.domain.BaseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val baseUseCase: BaseUseCase): ViewModel() {

    init {
        startBaseUseCase()
    }

    private fun startBaseUseCase() {
        viewModelScope.launch {
            val result = baseUseCase()
            println(result)
        }
    }
}