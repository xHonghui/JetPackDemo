package com.xhh.jetpackdemo.fragment.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xhh.jetpackdemo.R
import com.xhh.jetpackdemo.activity.SearchActivity
import com.xhh.jetpackdemo.databinding.FragmentMainBinding
import com.xhh.jetpackdemo.model.MainModel

class MainFragment : BaseFragment() {

    //entrance
    val toUserPage: Int = 1
    val toDetailPage: Int = 2
    val toSearchPage: Int = 3

    //user type
    val normalUser: Int = 1
    val vipUser: Int = 2

    val mainModel: MainModel by lazy { MainModel() }


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
        val binding = FragmentMainBinding.bind(view)
        binding.userEntrance = toUserPage
        binding.detailEntrance = toDetailPage
        binding.searchEntrance = toSearchPage
        binding.normalUserType = normalUser
        binding.vipUserType = vipUser
        binding.delegate = ActionDelegate()
    }

    inner class ActionDelegate {

        fun toNextPage(entrance: Int) {
            when (entrance) {
                toUserPage -> {
                    navigate(R.id.action_main_to_user)
                }
                toDetailPage -> {
                    navigate(R.id.action_main_to_detail2)
                }
                toSearchPage -> {
                    startActivity(Intent(context, SearchActivity::class.java))
                }
            }
        }

    }


}