package com.example.dogbreed.List

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogbreed.api.RetrofitInstance
import com.example.dogbreed.model.DogBreedList.ProductModel
import kotlinx.coroutines.launch

class DogListViewModel : ViewModel() {
    private val _productList = ProductModel()
    val productList: ProductModel = _productList


    init {
        getProductList()
    }

    fun getProductList() {
        viewModelScope.launch {

            val result = RetrofitInstance.apiClient.getDogBreed()

        }
    }
}