package com.example.speedrunapplication.data.repository

import com.example.speedrunapplication.data.api.StatusApi
import androidx.compose.runtime.mutableStateListOf
import com.example.speedrunapplication.data.model.Status
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StatusRepository(private val apiImpl : StatusApi) {

    private var _statuses = mutableStateListOf<Status>()
    val statuses: List<Status> = _statuses

    fun loadStatuses() {
        // get schools and then zip
        val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
            throwable.printStackTrace()
        }

        CoroutineScope(Dispatchers.IO + coroutineExceptionHandler).launch(Dispatchers.IO) {
            val statuses = apiImpl.getStatuses()
            _statuses.addAll(statuses)
        }
    }
}