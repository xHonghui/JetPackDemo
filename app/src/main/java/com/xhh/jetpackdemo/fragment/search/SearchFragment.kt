package com.xhh.jetpackdemo.fragment.search

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xhh.jetpackdemo.AppViewModelProvider
import com.xhh.jetpackdemo.R
import com.xhh.jetpackdemo.activity.SearchActivity
import com.xhh.jetpackdemo.bean.Shop
import com.xhh.jetpackdemo.fragment.main.BaseFragment
import com.xhh.jetpackdemo.model.SearchModel
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_search.setOnClickListener {
            onSearch()
        }
    }

    private fun onSearch() {
        activity?.run {
            if (this is SearchActivity) {
                val searchModel = getModel()
                searchModel.shopItem.value = Shop("1001", "维他柠檬茶", 6.00)
                navigate(R.id.action_search_to_search_result)
                Log.i("searchModel", "hashCode:${searchModel.hashCode()}")
            }
        }
    }

}