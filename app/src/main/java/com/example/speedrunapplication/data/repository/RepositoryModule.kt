package com.example.speedrunapplication.data.repository

import org.koin.dsl.module

val RepositoryModule = module {
    single{ StatusRepository(get()) }
}