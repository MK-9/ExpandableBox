package com.example.model

data class StoreItem(
    val header: String,
    val subHeader: String,
    val appItems: List<AppItem>,
    val type: Int
)