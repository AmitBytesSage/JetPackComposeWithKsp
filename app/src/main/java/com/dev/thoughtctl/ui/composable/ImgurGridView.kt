package com.dev.thoughtctl.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dev.thoughtctl.ui.HomeViewModelFactory
import com.dev.thoughtctl.ui.ImgurConstants.HORIZONTAL_PADDING_GRID
import com.dev.thoughtctl.ui.ImgurConstants.MAX_ITEM_IN_GRID
import com.dev.thoughtctl.ui.ImgurConstants.VERTICAL_PADDING_GRID

@Composable
fun ImgurGridView(viewModel: ViewModel = viewModel(factory = HomeViewModelFactory())) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(MAX_ITEM_IN_GRID),
        verticalArrangement = Arrangement.spacedBy(VERTICAL_PADDING_GRID),
        horizontalArrangement = Arrangement.spacedBy(HORIZONTAL_PADDING_GRID)
    ) {
        item {

        }
    }
}