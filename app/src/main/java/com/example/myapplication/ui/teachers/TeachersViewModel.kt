package com.example.myapplication.ui.teachers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TeachersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is teachers Fragment"
    }
    val text: LiveData<String> = _text
}