package com.example.technicalspecification.network

import com.example.technicalspecification.model.Object

import retrofit2.http.GET

interface RetrofitService {

    @GET("generic-metal-shoes-562445714")
    suspend fun getDetailFragmentApi() : Object

    @GET("generic-metal-shoes-562445714")
    suspend fun getDescFragmentApi() : Object

    @GET("generic-metal-shoes-562445714")
    suspend fun getSellerFragmentApi() : Object

//    @GET("generic-metal-shoes-562445714")
//    suspend fun getCharacteristicsFragmentApi() : Object
}