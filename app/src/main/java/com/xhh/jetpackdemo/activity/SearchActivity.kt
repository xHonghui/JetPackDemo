package com.xhh.jetpackdemo.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.xhh.jetpackdemo.AppViewModelProvider
import com.xhh.jetpackdemo.R
import com.xhh.jetpackdemo.model.SearchModel

class SearchActivity : AppCompatActivity() {

    private val searchModel: SearchModel by lazy {
        AppViewModelProvider.getInstance().get(SearchModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        Log.i("searchModel", "hashCode:${searchModel.hashCode()}")
    }

    fun getModel(): SearchModel {
        return searchModel
    }

}