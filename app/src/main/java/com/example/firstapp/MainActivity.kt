package com.example.firstapp

import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printAppInfo()
    }

    private fun printAppInfo() {
        val manager = this.packageManager
        val info = manager.getPackageInfo(this.packageName, PackageManager.GET_ACTIVITIES)
        Log.d("mLog", "App Info: " + info.packageName + " v" + info.versionName + "("
                + info.versionCode + ")")
    }
}
