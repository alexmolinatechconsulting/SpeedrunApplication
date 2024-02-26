package com.example.speedrunapplication

import android.app.Application
import com.example.speedrunapplication.api.NetworkModule
import com.example.speedrunapplication.repository.RepositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SpeedrunApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@SpeedrunApplication)
            modules(listOf(NetworkModule, RepositoryModule))
        }
    }
}