package com.example.speedrunapplication.data.api

import com.example.speedrunapplication.data.model.Status
import retrofit2.Retrofit

class StatusApiImpl(private var retrofit : Retrofit) : StatusApi {

    override suspend fun getStatuses() : List<Status> {
        val service = retrofit.create(StatusApi::class.java)
        return service.getStatuses()
    }
}