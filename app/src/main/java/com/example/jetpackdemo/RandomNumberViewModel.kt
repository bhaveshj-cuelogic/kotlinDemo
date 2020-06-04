package com.example.jetpackdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel:ViewModel(){
    // Create a LiveData with a random number
    val currentRandomNumber:MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}