package com.example.speedrunapplication.data.api

import com.example.speedrunapplication.BuildConfig
import com.example.speedrunapplication.data.model.Status
import retrofit2.http.GET

interface StatusApi {
    @GET(BuildConfig.ENDPOINT_STATUS)
    suspend fun getStatuses() : List<Status>
}