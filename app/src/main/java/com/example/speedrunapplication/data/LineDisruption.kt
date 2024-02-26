package com.example.speedrunapplication.data

import com.google.gson.annotations.SerializedName

data class LineDisruption(
    @SerializedName("\$type")
    val type : String?,
    @SerializedName("category")
    val category : String?,
    @SerializedName("categoryDescription")
    val categoryDescription : String?,
    @SerializedName("description")
    val description : String?,
    @SerializedName("affectedRoutes")
    val affectedRoutes : Any?,
    @SerializedName("affectedStops")
    val affectedStops : Any?,
    @SerializedName("closureText")
    val closureText : String?
)
