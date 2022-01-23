package com.example.example_navigation.ui.configuracion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConfiguracionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is configuration fragment"
    }
    val text: LiveData<String> = _text

}