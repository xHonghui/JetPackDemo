package com.xhh.jetpackdemo.fragment.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.xhh.jetpackdemo.R

open class BaseFragment:Fragment() {

    var TAG:String = "fragment test ${javaClass.simpleName}"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG,"fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG,"fragment onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG,"fragment onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG,"fragment onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG,"fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG,"fragment onDetach")
    }

    fun navigate(actionId: Int, args: Bundle? = null, navOption: NavOptions? = null, navigatorExtras: Navigator.Extras? = null) {
        var finalNavOption: NavOptions? = navOption
        if (finalNavOption == null) {
            val currentDest = findNavController().currentDestination
            if (currentDest != null) {
                val action = currentDest.getAction(actionId)
                if (action != null && action.navOptions != null) {
                    if (action.navOptions!!.popUpTo != -1 || action.navOptions!!.enterAnim != -1 || action.navOptions!!.exitAnim != -1
                        || action.navOptions!!.popEnterAnim != -1 || action.navOptions!!.popExitAnim != -1) {
                        finalNavOption = action.navOptions
                    }
                }
            }
        }
        if (finalNavOption == null) {
            finalNavOption = navOptions {
                anim {
                    enter = R.anim.fragment_fade_enter
                    exit = R.anim.fragment_fade_exit
                    popEnter = R.anim.fragment_fade_enter
                    popExit = R.anim.fragment_fade_exit
                }
            }
        }
        findNavController().navigate(actionId, args, finalNavOption, navigatorExtras)
    }
}