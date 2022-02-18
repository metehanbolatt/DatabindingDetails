package com.metehanbolat.databindingdetails

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    val message = MutableLiveData<String>()

    fun setMessage(text: String) {
        message.value = text
    }
}