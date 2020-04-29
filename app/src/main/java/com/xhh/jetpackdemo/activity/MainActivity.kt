package com.xhh.jetpackdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xhh.jetpackdemo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }
}
