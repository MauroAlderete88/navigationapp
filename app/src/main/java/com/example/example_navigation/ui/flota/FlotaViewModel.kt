package com.example.example_navigation.ui.flota

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FlotaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Flota fragment"
    }
    val text: LiveData<String> = _text

}