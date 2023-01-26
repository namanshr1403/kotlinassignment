package com.example.activitieskotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MyStateChangeActivity : Activity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Activity and inflate the UI.
        Log.d("MyStateChangeActivity", "onCreate()")
    }
     override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d("MyStateChangeActivity", "onRestoreInstanceState")
    }

     override fun onRestart() {
        super.onRestart()

        Log.d("MyStateChangeActivity", "onRestart")
    }

     override fun onStart() {
        super.onStart()

        Log.d("MyStateChangeActivity", "onStart")
    }

    // Called at the start of the active lifetime.
     override fun onResume() {
        super.onResume()

        Log.d("MyStateChangeActivity", "onResume")
    }
     override fun onSaveInstanceState(savedInstanceState: Bundle) {

        super.onSaveInstanceState(savedInstanceState)
        Log.d("MyStateChangeActivity", "onSaveInstanceState")
    }


     override fun onPause() {

        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }


     override fun onStop() {

        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }
     override fun onDestroy() {
        // Clean up any resources including ending threads,
        // closing database connections etc.
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }

}