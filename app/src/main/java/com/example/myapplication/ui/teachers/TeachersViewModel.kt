package com.example.myapplication.ui.schools

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TeachersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is schools Fragment"
    }
    val text: LiveData<String> = _text
}