package com.example.speedrunapplication.api

import com.example.speedrunapplication.data.Status
import retrofit2.Retrofit

class StatusApiImpl(private var retrofit : Retrofit) : StatusApi {

    override suspend fun getStatuses() : List<Status> {
        val service = retrofit.create(StatusApi::class.java)
        return service.getStatuses()
    }
}