package com.xhh.jetpackdemo.fragment.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.xhh.jetpackdemo.R
import com.xhh.jetpackdemo.fragment.main.BaseFragment
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
        tv_search_result.setOnClickListener {
            Toast.makeText(context, "搜索结果在此", Toast.LENGTH_LONG).show()
        }
    }

}