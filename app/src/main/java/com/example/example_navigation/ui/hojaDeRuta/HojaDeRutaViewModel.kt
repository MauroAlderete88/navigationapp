package com.example.example_navigation.ui.hojaDeRuta


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HojaDeRutaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is hoja de ruta"
    }
    val text: LiveData<String> = _text

}