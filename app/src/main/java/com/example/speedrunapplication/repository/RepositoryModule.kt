package com.example.speedrunapplication.repository

import org.koin.dsl.module

val RepositoryModule = module {
    single{StatusRepository(get())}
}