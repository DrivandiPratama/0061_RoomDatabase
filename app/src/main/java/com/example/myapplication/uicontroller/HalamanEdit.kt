package com.example.myapplication.uicontroller

import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class))
@Composable
fun EditSiswaScreen(
    navigateback: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {

}