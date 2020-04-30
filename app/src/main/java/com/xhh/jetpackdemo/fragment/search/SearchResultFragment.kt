package com.xhh.jetpackdemo.fragment.search

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.xhh.jetpackdemo.AppViewModelProvider
import com.xhh.jetpackdemo.R
import com.xhh.jetpackdemo.activity.SearchActivity
import com.xhh.jetpackdemo.fragment.main.BaseFragment
import com.xhh.jetpackdemo.model.SearchModel
import kotlinx.android.synthetic.main.fragment_search_result.*

class SearchResultFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.run {
            if (this is SearchActivity) {
                val searchModel = getModel()
                searchModel.shopItem.observe(viewLifecycleOwner, Observer {
                    //拿到搜索关键词，就可以去请求接口搜索结果数据了
                    tv_search_result.text = it.toString()
                })
                Log.i("searchModel", "hashCode:${searchModel.hashCode()}")
            }
        }
    }

}