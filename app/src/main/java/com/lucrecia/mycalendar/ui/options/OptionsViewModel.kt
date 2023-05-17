package com.lucrecia.mycalendar.ui.options

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OptionsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Here you will see options and settings to adjust"
    }
    val text: LiveData<String> = _text
}