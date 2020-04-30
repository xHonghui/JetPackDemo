package com.xhh.jetpackdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ViewModel 的生命周期跟组件生命周期稍微长一点，由于外部不可抗力因素，组件可能会经历多次重建/销毁
 * 但是关联该组件的 ViewModel 仍然是同一个
 * */
class MainModel : ViewModel() {

    var homePageData = MutableLiveData<String>()
    var content = MutableLiveData<String>()

    private var homePageRepository = HomePageRepository()

    init {
        val result = homePageRepository.getHomePage()
        homePageData.value = result
    }

}