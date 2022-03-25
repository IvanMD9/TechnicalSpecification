package com.example.technicalspecification.model

data class Object(val data: Data)

data class Data(
    val images : List<String>,
    val title : String,
    val subTitle : String,
    val description : String,
    val price: Price,
    val oldPrice: OldPrice,
    val shop: Shop,
    val brand: Brand,
    val rating: Rating
    //val characteristics: Characteristics
)

data class Price(val value : Int, val currency : String, )
data class OldPrice(val value : Int, val currency : String, )
data class Shop(val subTitle : String, val info : String)
data class Brand(val slug : String, val image : String)
data class Rating(val score : Double)

//data class Characteristics(val characteristics : Map<Int, Map<String, String>>)
