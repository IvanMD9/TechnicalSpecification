package com.example.technicalspecification.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.technicalspecification.model.Object
import com.example.technicalspecification.network.RetrofitInstance
import com.example.technicalspecification.network.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SellerViewModel : ViewModel() {

    private val sellerLiveData : MutableLiveData<Object> = MutableLiveData()

    fun getSellerObserver() : MutableLiveData<Object> {
        return sellerLiveData
    }

    fun makeSellerApiCall() {
        viewModelScope.launch(Dispatchers.IO) {
            val detailInstance = RetrofitInstance
                .getFragmentInstance()
                .create(RetrofitService::class.java)
            val response = detailInstance.getSellerFragmentApi()
            sellerLiveData.postValue(response)
        }
    }
}