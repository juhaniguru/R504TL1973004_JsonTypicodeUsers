package com.example.r504tl1973004_jsontypicodeusers.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun UsersScreenRoot(modifier: Modifier = Modifier) {
    val vm = viewModel<UsersScreenViewModel>()
    val state by vm.state.collectAsStateWithLifecycle()

    UsersScreen(state = state)
}

@Composable
fun UsersScreen(modifier: Modifier = Modifier, state: UsersState) {

}

@Composable
fun UsersList(modifier: Modifier = Modifier) {

}