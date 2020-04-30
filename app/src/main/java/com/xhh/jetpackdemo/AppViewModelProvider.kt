package com.xhh.jetpackdemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore

/**
 * viewModel Provider，通过该类获取 ViewModel 对象
 * */
class AppViewModelProvider(factory: Factory) : ViewModelProvider(ViewModelStore(), factory) {

    companion object {
        fun getInstance(): AppViewModelProvider = AppViewModelProvider(AppViewModelFactory())
    }

    class AppViewModelFactory() : Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return modelClass.newInstance()
        }
    }

}