package com.example.speedrunapplication.data.model

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("\$type")
    val type : String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("modeName")
    val modeName : String?,
    @SerializedName("disruptions")
    val disruptions : Any?,
    @SerializedName("created")
    val created : String?,
    @SerializedName("modified")
    val modified : String?,
    @SerializedName("lineStatuses")
    val lineSatuses : List<LineStatus>?,
    @SerializedName("routeSections")
    val routeSections : Any?,
    @SerializedName("serviceTypes")
    val serviceTypes : Any?,
    @SerializedName("crowding")
    val crowding : Any?
)