package com.xhh.jetpackdemo.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.xhh.jetpackdemo.BaseFragment
import com.xhh.jetpackdemo.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn1.setOnClickListener {
            navigate(R.id.action_main_to_user)
        }
        btn2.setOnClickListener {
            navigate(R.id.action_main_to_detail2)
        }
        btn3.setOnClickListener {
            Toast.makeText(context, "btn3", Toast.LENGTH_LONG).show()
        }
    }


}