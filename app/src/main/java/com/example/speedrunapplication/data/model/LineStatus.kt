package com.example.speedrunapplication.data.model

import com.google.gson.annotations.SerializedName

data class LineStatus(
    @SerializedName("\$type")
    val type : String?,
    @SerializedName("id")
    val id : String?,
    @SerializedName("lineId")
    val lineId : String?,
    @SerializedName("statusSeverity")
    val statusSeverity : String?,
    @SerializedName("statusSeverityDescription")
    val statusSeverityDescription : String?,
    @SerializedName("reason")
    val reason : String?,
    @SerializedName("created")
    val created : String?,
    @SerializedName("validityPeriods")
    val validityPeriods : Any?,
    @SerializedName("disruption")
    val disruption : LineDisruption?
)
