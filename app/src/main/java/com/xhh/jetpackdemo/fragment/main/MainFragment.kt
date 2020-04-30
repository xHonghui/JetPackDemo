package com.xhh.jetpackdemo.fragment.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.xhh.jetpackdemo.AppViewModelProvider
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

    private val mainModel: MainModel by lazy {
        AppViewModelProvider.getInstance().get(MainModel::class.java)
    }

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
        val dataBinding = FragmentMainBinding.bind(view)
        dataBinding.userEntrance = toUserPage
        dataBinding.detailEntrance = toDetailPage
        dataBinding.searchEntrance = toSearchPage
        dataBinding.normalUserType = normalUser
        dataBinding.vipUserType = vipUser
        dataBinding.delegate = ActionDelegate()
        dataBinding.content = mainModel.content
        dataBinding.lifecycleOwner = viewLifecycleOwner
        createMainModel()
    }

    private fun createMainModel() {
        mainModel.homePageData.observe(viewLifecycleOwner, Observer {
            mainModel.content.value = it
        })
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

        fun refresh() {
            mainModel.homePageData.value = "刷新数据 \n 当前刷新时间：${System.currentTimeMillis()}"
        }

    }


}