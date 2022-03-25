package com.example.technicalspecification.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.technicalspecification.model.Object
import com.example.technicalspecification.network.RetrofitInstance
import com.example.technicalspecification.network.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SpecViewModel : ViewModel() {

    private val characteristicsLiveData : MutableLiveData<Object> = MutableLiveData()

    fun getCharacteristicsObserver() : MutableLiveData<Object> {
        return characteristicsLiveData
    }

//    fun makeCharacteristicsApiCall() {
//        viewModelScope.launch(Dispatchers.IO) {
//            val characteristicsInstance = RetrofitInstance
//                .getFragmentInstance()
//                .create(RetrofitService::class.java)
//            val response = characteristicsInstance.getCharacteristicsFragmentApi()
//            characteristicsLiveData.postValue(response)
//        }
//    }
}