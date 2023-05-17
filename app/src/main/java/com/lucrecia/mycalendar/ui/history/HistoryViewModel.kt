package com.lucrecia.mycalendar.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Here you will see a log of activity with timestamps"
    }
    val text: LiveData<String> = _text
}