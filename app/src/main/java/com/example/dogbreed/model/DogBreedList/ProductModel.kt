package com.example.dogbreed.model.DogBreedList


import com.google.gson.annotations.SerializedName

data class ProductModel(
    @SerializedName("message")
    val message: MessageModel<Any?>? = MessageModel(),
    @SerializedName("status")
    val status: String? = ""
)