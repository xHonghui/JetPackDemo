package com.xhh.jetpackdemo.fragment.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xhh.jetpackdemo.R
import com.xhh.jetpackdemo.fragment.main.BaseFragment
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment:BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_search.setOnClickListener {
            navigate(R.id.action_search_to_search_result)
        }
    }

}