package com.dev.thoughtctl.ui.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dev.thoughtctl.ui.HomeViewModelFactory

@Composable
fun ImgurListView(viewModel: ViewModel = viewModel(factory = HomeViewModelFactory())) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    ) {

    }
}