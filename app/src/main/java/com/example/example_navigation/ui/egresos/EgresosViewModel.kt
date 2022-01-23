package com.example.example_navigation.ui.egresos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EgresosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is egresos fragment"
    }
    val text: LiveData<String> = _text
}