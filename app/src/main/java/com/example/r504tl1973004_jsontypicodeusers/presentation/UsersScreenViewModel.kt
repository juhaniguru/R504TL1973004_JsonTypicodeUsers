package com.example.r504tl1973004_jsontypicodeusers.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class UsersScreenViewModel : ViewModel() {
    private val _state = MutableStateFlow(UsersState())
    val state = _state.asStateFlow()


}