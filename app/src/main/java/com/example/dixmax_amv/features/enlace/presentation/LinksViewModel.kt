package com.example.dixmax_amv.features.enlace.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.enlace.domain.GetLinkListUseCase
import com.example.dixmax_amv.features.enlace.domain.Link
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class LinksViewModel(val getLinkListUseCase: GetLinkListUseCase) : ViewModel() {
    private val _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> get() = _uiState

    private var linksLoaded: List<Link> = emptyList()

    fun loadLinks() {
        _uiState.value = UiState(loading = true)
        Log.d("@links","Estado loading en viewModel")
        viewModelScope.launch(Dispatchers.IO) {
            try {
                linksLoaded = getLinkListUseCase()
                Log.d("@links", "${linksLoaded.size}")
                _uiState.postValue(UiState(links = linksLoaded))
            } catch (e: Exception) {
                _uiState.postValue(UiState(error = true))
            }
        }
    }

    data class UiState(
        val links: List<Link> = emptyList(),
        val loading: Boolean = false,
        val error: Boolean = false
    )
}