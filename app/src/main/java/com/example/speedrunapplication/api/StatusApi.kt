package com.example.speedrunapplication.api

import com.example.speedrunapplication.BuildConfig
import com.example.speedrunapplication.data.Status
import retrofit2.http.GET
import retrofit2.http.Query

interface StatusApi {
    @GET(BuildConfig.ENDPOINT_STATUS)
    suspend fun getStatuses() : List<Status>
}