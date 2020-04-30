package com.xhh.jetpackdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xhh.jetpackdemo.bean.Shop

class SearchModel : ViewModel() {

    val shopItem = MutableLiveData<Shop>()

}