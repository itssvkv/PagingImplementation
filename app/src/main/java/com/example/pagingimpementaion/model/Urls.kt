package com.example.pagingimpementaion.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Urls(
    //how to rename a variable here but still get the data right
    @SerialName("regular")
    val regularImage: String
)
