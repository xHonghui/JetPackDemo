package com.xhh.jetpackdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainModel : ViewModel() {

    var homePageData = MutableLiveData<String>()

    private var homePageRepository = HomePageRepository()

    init {

        val result = homePageRepository.getHomePage()
        homePageData.value = result
    }


}