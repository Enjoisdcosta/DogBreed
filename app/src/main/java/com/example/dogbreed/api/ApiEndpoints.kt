package com.example.dogbreed.api

import com.example.dogbreed.model.DogBreedList.MessageModel
import retrofit2.http.GET

interface ApiEndpoints {
    //    @GET(ApiDetail.BASE_URL)
//    suspend fun getDogBreed():
    @GET(ApiDetail.BASE_URL)
    suspend fun getDogBreed(): MessageModel<Any?>
}