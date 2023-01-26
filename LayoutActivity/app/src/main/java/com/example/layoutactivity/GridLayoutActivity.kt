package com.example.layoutactivity

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class GridLayoutActivity : Activity() {
    /**
     * Called when the activity is first created.
     */
    var button: Button? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grid_layout)
    }
}