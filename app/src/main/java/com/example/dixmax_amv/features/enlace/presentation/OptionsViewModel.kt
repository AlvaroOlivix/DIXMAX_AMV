package com.example.dixmax_amv.features.enlace.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.enlace.domain.GetLinkByIdUseCase
import com.example.dixmax_amv.features.enlace.domain.Link
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class OptionsViewModel(val getLinkUseCase: GetLinkByIdUseCase) : ViewModel() {
    private val _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> get() = _uiState

    private var linkLoaded: Link? = null

    fun loadOptions(linkId: String) {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                linkLoaded = getLinkUseCase(linkId)
                _uiState.postValue(UiState(link = linkLoaded))
            } catch (e: Exception) {
                _uiState.postValue(UiState(error = true))
            }
        }
    }

    data class UiState(
        val link: Link? = null,
        val loading: Boolean = false,
        val error: Boolean = false
    )
}