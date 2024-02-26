package com.example.speedrunapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.speedrunapplication.repository.StatusRepository
import org.koin.android.ext.android.get
import androidx.activity.compose.setContent
import com.example.speedrunapplication.ui.StatusesList

class MainActivity : AppCompatActivity() {

    // call the load repo function here once and paste the list - so its not called all the time
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val schoolRepo = get<StatusRepository>()
        schoolRepo.loadStatuses() // how to only load this once

        setContent {
            StatusesList(sr = schoolRepo)
        }
    }
}