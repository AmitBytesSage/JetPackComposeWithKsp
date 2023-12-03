package com.dev.imgurlib.response

data class TopImages(
    val `data`: List<Data>,
    val status: Int,
    val success: Boolean
)